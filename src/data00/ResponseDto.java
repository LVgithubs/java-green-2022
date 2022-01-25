package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ResponseDto
 */
@Data // Data - getter setter tostring 까지 들고있다.
@AllArgsConstructor
public class ResponseDto {
    private Response response; // 변수 명을 꼭 동일하게!

    @Data // Data - getter setter tostring 까지 들고있다.
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data // Data - getter setter tostring 까지 들고있다.
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;

        }

        @Data // Data - getter setter tostring 까지 들고있다.
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @Data // Data - getter setter tostring 까지 들고있다.
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data // Data - getter setter tostring 까지 들고있다.
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
