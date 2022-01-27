package dataweather;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
abstract class WeatherArea {
    private String Area;
    private int x;
    private int y;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }
}

@Data
class 부산 extends WeatherArea {
    private String Area = "부산";
    private int x = 98;
    private int y = 74;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 서울 extends WeatherArea {
    private String Area = "서울";
    private int x = 60;
    private int y = 127;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 울산 extends WeatherArea {
    private String Area = "서울";
    private int x = 102;
    private int y = 84;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 광주 extends WeatherArea {
    private String Area = "광주";
    private int x = 58;
    private int y = 74;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 대구 extends WeatherArea {
    private String Area = "대구";
    private int x = 89;
    private int y = 90;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 대전 extends WeatherArea {
    private String Area = "대전";
    private int x = 37;
    private int y = 100;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}

@Data
class 제주도 extends WeatherArea {
    private String Area = "제주도";
    private int x = 52;
    private int y = 38;

    String seachArea() {
        return Area;
    }

    int findx() {
        return x;
    }

    int findy() {
        return y;
    }

}