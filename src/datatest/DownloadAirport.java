package userTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import userTest.AirportDto.Response.Body.Items.Item;

public class DownloadAirport {

    // 공항목록을 조회=> Map에 담아서 return
    public static Map<String, String> getAirportList() {
        Map<String, String> airportMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

            // conn -> Byte Stream
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 원래 default가 1Byte이기에 한글(3Byte)을 읽으면 깨진다.
            // utf-8는 한글을 3Byte로 끊어 읽는다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
        } catch (Exception e) {
            System.out.println("공항목록 조회중 오류가 발생했습니다.");
        }
        return airportMap;
    }
}