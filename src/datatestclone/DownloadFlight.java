package datatestclone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatestclone.ResponseDto.Response.Body.Items.FlightItem;

public class DownloadFlight {

    // 특정 날짜에 특정 출발지에서 특정 목적지로 도착하는 항공편 정보를
    // 가져오는 메서드
    public static List<FlightItem> getFlightList(
            String depPlandTime,
            String depAirportNm,
            String arrAirportNm) {

        Map<String, String> airportMap = DownloadAirport.getAirportList();
        // 출발하는 공항편의 아이디와 도착하는 공항편의 아이디, 공항사의 아이디를 받는다.
        String depAirportId = airportMap.get(depAirportNm);
        String arrAirportId = airportMap.get(arrAirportNm);
        // String airlineId = airportMap.get(airlineNm);
        System.out.println(getFlightList(depPlandTime, depAirportId, arrAirportId));
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId="
                            + depAirportId + "&arrAirportId="
                            + arrAirportId + "&depPlandTime="
                            + depPlandTime + "&_type=json");

            // http 의 주소 중 출발하는 공항지의 아이디, 도착하는 공항지의 아이디, 그리고 출발하는 시간을 List 로 받아둔 것을 url을
            // 이용해서 uri 방식에 이렇게 문자열로 넣을 수 있었다.

            // http 연결 옵션
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto<FlightItem> dto = gson.fromJson(responseJson, ResponseDto.class);

            // import 할때 조심!
            // FlightDto의 item을 들고 와야한다!
            List<FlightItem> result = dto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("항공편 조회중 오류가 발생했습니다.");
        }
        return null;
        // return 을 하지 않으면 오류가 뜨므로 꼭 반드시 아래에, 예외 처리를 한 뒤 return null을 적어두자.
    }

}
