package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 90; //성적 - 변수 초기화(선언 + 값 대입).

        //자바에서 어떠한 괄호가 나오고 그 다음 중괄호가 나오는 형태의 문법을 사용한다.
        //여기서 중괄호의 영역 = 행위의 영역.


        if (true) {
    
}

        if (point >= 90) { //point 가 90점 이상일 때 (이 값이 true로 반환된다면),
            System.out.println("A 학점입니다"); //A 학점입니다. 를 출력합니다.
        }
        else {
            System.out.println("A학점이 아닙니다"); //point 가 90점 이상이 아니라면, A학점이 아닙니다. 를 출력합니다.
        }


    }
    
}
