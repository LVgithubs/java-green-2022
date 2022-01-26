//package datatestclone;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//항공- 전체 정보 일람
@Data
@AllArgsConstructor
public class FlightDto {
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
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
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
