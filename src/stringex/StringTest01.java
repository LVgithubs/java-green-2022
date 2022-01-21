package stringex;

import java.util.Scanner;

class 개인정보 {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public 개인정보(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class StringTest01 {
    public static void main(String[] args) {
        // 1. scanner 로 문자열 받기
        // Ex - > "A01 - 이름 : 홍길동 - 전화번호 : 01022222222 - 성별 : 남 - 나이 : (띄우기)20"
        // 2. - 로 split()
        // 3. 첫 데이터가 A01 이면 파싱 시작
        // 4.(파싱 시작했을때) -> 1번지 부터 파싱 시작
        // 이름(String)- 연락처(String)-성별(Char)-나이(int)
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        // System.out.println("입력받은 데이터는" + data + " 입니다.");

        String[] tokens = data.split("-");
        for (int i = 0; i < tokens.length; i++) {
            // System.out.println(tokens[i]);
        }

        if (tokens[0].equals("A01")) {

            String name = tokens[1];
            String tel = tokens[2];
            char gender = tokens[3].charAt(0);
            tokens[4] = tokens[4].trim();
            int age = Integer.parseInt(tokens[4]);

            개인정보 doc1 = new 개인정보(
                    name,
                    tel,
                    gender,
                    age);
            System.out.println("이름 : " + doc1.getName() + " 전화번호 : "
                    + doc1.getTel() + " 성별 : " + doc1.getGender() +
                    " 나이 : " + doc1.getAge());
        } else {
            System.out.println("첫 입력 데이터가 잘못 되었습니다.");
        }

    }

}
