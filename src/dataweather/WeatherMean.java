package dataweather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class WeatherMean {

    private Map<String, String> mean = new HashMap<>();

    String Findmean(String code) {
        mean.put("PTY", "강수형태");
        mean.put("REH", "습도");
        mean.put("RN1", "1시간 강수량");
        mean.put("T1H", "기온");
        mean.put("UUU", "동서바람");
        mean.put("VEC", "풍향");
        mean.put("VVV", "남북바람");
        mean.put("WSD", "풍속");

        String means = mean.get(code);
        return means;
    }

    private Map<String, String> sign = new HashMap<>();

    String Findcode(String code) {
        sign.put("기온", "℃");
        sign.put("1시간 강수량", "mm");
        sign.put("동서바람", "m/s");
        sign.put("남북바람", "m/s");
        sign.put("습도", "%");
        sign.put("강수형태", "-");
        sign.put("풍향", "deg");
        sign.put("풍속", "m/s");

        String means = sign.get(code);
        return means;
    }

}
