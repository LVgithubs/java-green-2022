package userapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);

            // conn 은 bytestream= 아직 방향을 인정함
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            // 1.통신검증
            if (dto.getCode() != 1) {
                System.out.println("통신실패 " + dto.getMsg());
                return;
            }

            // 2.프로그램 만들기
            // 1 화면에 회원 정보를 출력하겠다

            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원 번호 :" + dto.getData().get(i).getId());
                System.out.println("회원 비밀번호 :" + dto.getData().get(i).getPassword());
                System.out.println("회원 메일 :" + dto.getData().get(i).getEmail());
                System.out.println("회원 이름 :" + dto.getData().get(i).getUsername());
                System.out.println("회원 생성일 :" + dto.getData().get(i).getCreated());
                System.out.println("회원 최근변경일 :" + dto.getData().get(i).getUpdated());
                System.out.println("=================");
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
