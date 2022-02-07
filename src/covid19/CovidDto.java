package covid19;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class CovidDto {
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
            private int numOfRows; // 페이지 결과수
            private int pageNo; // 페이지 수
            private int totalCount; // 전체 결과 수

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private int accExamCnt; // 누적 의심 신고 검사자
                    private String createDt; // 등록 일 시 분 초
                    private int deathCnt; // 사망자 수
                    private int decideCnt; // 확진자 수
                    private int seq; // 게시글 번호
                    private String stateDt; // 기준 일
                    private String stateTime; // 기준 시간
                    private String updateDt; // 수정 일 시 분 초

                }
            }
        }
    }
}