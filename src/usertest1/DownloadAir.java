package userTest.usertest1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

import userTest.usertest1.ResponseDto.Response.Body.Items.Item.airportItem;

public class DownloadAir {

    public static Map<String,String> getAirList() {
        try{
            URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json")
            

            HttpURLConnection coon =(HttpURLConnection) url.openConnection();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(coon.getInputStream(),"utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto<airportItem> dto = dto.getResponse().getBody().getItems().get
        }catch(){}

    }

}