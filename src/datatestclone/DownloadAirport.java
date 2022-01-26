package datatestclone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatestclone.*;
import datatestclone.ResponseDto.Response.Body.Items.AirportItem;

public class DownloadAirport {

    // 공항목록을 조회하여 Map 에 담아서 return하는 리스트
    // getAirportList()
    public static Map<String, String> getAirportList() {
        Map<String, String> airportMap = new HashMap<>();
        try {
            // url을 받아온다
            // 공항 목록과 공항 ID 만 있는 공공데이터 홈페이지
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // conn 에서 받아온 글자들을
            // buffer로 받아서 utf-8 문자로 끊어 읽기 위해
            // 3바이트 씩 끊어 읽는다.

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();

            ResponseDto<AirportItem> dto = gson.fromJson(responseJson, ResponseDto.class);

            // Item 을 import 할때 조심!
            // import 항목에서 제대로 AirportDto 를 받아왔는지 확인해야한다!
            List<AirportItem> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("공항 목록 조회 중 오류가 발생하였습니다.");
        }
        return airportMap;
    }

}
