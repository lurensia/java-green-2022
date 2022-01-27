package cloud;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import cloud.CloudDto.Response.Body.Items.Item;

public class DownloadCloud {
    // 특정날짜와 특정시간 데이터를 받아와 url 값 바꾸기.
    public static Map<String, String> getCloudList(String baseDate, String baseTime) {
        Map<String, String> CloudMap = new HashMap<>();// 날씨코드와 온도 습득

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/<개인키>&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=98&ny=75&type=json");
            // connect => Byte Stream
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            CloudDto dto = gson.fromJson(responseJson, CloudDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                CloudMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            } // 맵에 날씨코드와 온도 저장
            return CloudMap;
        } catch (Exception e) {
            System.out.println("초단기실황 기상 조회중 오류가 발생했습니다.");
        }
        return null;
    }
}
