package data00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data00.AirportDto.Response.Body.Items.Item;
import com.google.gson.Gson;

public class Test02 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 한글을 3byte 로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // BufferedWriter bw = new BufferedWriter(new
            // OutputStreamWriter(conn.getOutputStream()));

            // InputStreamReader ir = new InputStreamReader(conn.getInputStream());
            // char[] ch = new char[1];
            // 이건 하나씩 밖에 받아올 수 밖에 없고, 배열을 사용한다 할지언정 결국 공간이 남아있는 상태이기 때문에
            // 쓰이지 않는다,

            String responseJson = br.readLine();
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);

            List<Item> items = dto.getResponse().getBody().getItems().getItem();
            // System.out.println(items);

            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < items.size() - 1; i++) {
                airportMap.put(items.get(i).getAirportNm(), items.get(i).getAirportId());
            }
            System.out.println(airportMap.get("제주"));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("주소 입력이 잘못되었습니다.");
            e.printStackTrace();
        }
    }

}
