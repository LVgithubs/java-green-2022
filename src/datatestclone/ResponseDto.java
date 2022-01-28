package datatestclone;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//항공- 전체 정보 일람

//리플렉션을 해서 json을 아는것은 필드를 보고 결정한다.
//따라서 데이터를 Airport 로 할지 Flight로 할지는 제네릭으로만 적혀있으면 알 수 없기 때문에
//밑의 Airport와 Flight 를 상속하는 추상 클래스/부모 클래스가 하나 필요하다.

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;

            @Data
            @AllArgsConstructor
            class Items {
                private List<T> item;

                @Data
                @AllArgsConstructor
                class AirportItem {
                    private String airportId;
                    private String airportNm;

                }

                @Data
                @AllArgsConstructor
                class FlightItem {
                    private String airlineNm;
                    private String arrAirportNm;
                    private String arrPlandTime;
                    private String depAirportNm;
                    private String depPlandTime;
                    private int economyCharge;
                    private int prestigeCharge;
                    private String vihicleId;
                }
            }
        }
    }
}
