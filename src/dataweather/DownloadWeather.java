package dataweather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import dataweather.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    public static List<Item> getWeatherList(
            String baseDate,
            String baseTime,
            int nx,
            int ny) {

        // Map<String, String> WeatherMap = DownloadWeather.getWeatherList();

        // String date = WeatherMap.get(baseDate);
        // String time = WeatherMap.get(baseTime);

        // System.out.println(getWeatherList(baseDate, baseTime, nx, ny));
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=d1uFGPu0fiyJtWlDbAQndFtLMtG13T1faOU84l0gqCsJlERnKq%2BuTZY6oaYtmHcMo8N6Xrw%2BniqUoflvtBwEuQ%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time="
                            + baseTime + "&nx=" + nx + "&ny=" + ny);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);

            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("조회중 오류가 발생했습니다.");
        }
        return null;
    }

}
