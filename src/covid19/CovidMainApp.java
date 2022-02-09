package covid19;

import java.util.List;
import java.util.Scanner;

import covid19.CovidDto.Response.Body.Items.Item;

public class CovidMainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======코로나 현황을 알려드리겠습니다.======");
        System.out.println("======코로나 시작 날짜를 입력하세요.======");
        System.out.println("Ex:20220110 ");
        String covidStart = sc.nextLine();

        System.out.println("======코로나 종료 날짜를 입력하세요.======");
        System.out.println("Ex:20220115 ");
        String covidUpdate = sc.nextLine();

        List<Item> result = DownloadCovid.getCovidList(covidStart, covidUpdate);

        for (int i = result.size() - 1; i > 0; i--) {
            System.out.println("==========================");
            System.out.println(result.get(i).getStateDt() + "일자의 코로나 현황");
            System.out
                    .println("누적 의심 신고 검사자 : " + result.get(i).getAccExamCnt());
            System.out.println("확진자 수 : " + (result.get(i - 1).getDecideCnt() - result.get(i).getDecideCnt()));
            System.out.println("사망자 수 : " + (result.get(i - 1).getDeathCnt() - result.get(i).getDeathCnt()));
            System.out.println("==========================");

            // System.out.println();
        }

    }
}
