//package datatestclone;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//항공 - 공항 아이디와 공항 이름만 기록

@Data
@AllArgsConstructor
public class AirportDto {
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
                    private String airportId;
                    private String airportNm;
                }
            }
        }
    }
}
