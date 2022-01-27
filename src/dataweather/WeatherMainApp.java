package dataweather;

import java.util.List;
import java.util.Scanner;

import dataweather.WeatherDto.Response.Body.Items.Item;

public class WeatherMainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeatherMean signs = new WeatherMean();

        System.out.println("======오늘 날짜를 입력하세요======");
        System.out.println("Ex:20220126");
        String today = sc.nextLine();

        System.out.println("======시간을 입력하세요======");
        System.out.println("Ex:0600 = 아침 6시");
        String wantTime = sc.nextLine();

        System.out.println("======지역을 입력하세요======");
        System.out.println("Ex:부산");
        // String wantArea = sc.nextLine();
        int x = 98;
        int y = 74;

        List<Item> result = DownloadWeather.getWeatherList(today, wantTime, x, y);

        System.out.println(today + "날짜의 " + wantTime + " 시간 부산 날씨를 알려드립니다.");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("==========================");
            System.out.println(
                    signs.Findmean(result.get(i).getCategory()) + "의 수치는 " + result.get(i).getObsrValue() +
                            signs.Findcode(signs.Findmean(result.get(i).getCategory())) + "입니다.");
            System.out.println("==========================");

            // System.out.println();
        }

    }

}
