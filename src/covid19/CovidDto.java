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

            public String getResultCode() {
                return resultCode;
            }

            public void setResultCode(String resultCode) {
                this.resultCode = resultCode;
            }

            public String getResultMsg() {
                return resultMsg;
            }

            public void setResultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
            }
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

                    public int getAccExamCnt() {
                        return accExamCnt;
                    }

                    public void setAccExamCnt(int accExamCnt) {
                        this.accExamCnt = accExamCnt;
                    }

                    public String getCreateDt() {
                        return createDt;
                    }

                    public void setCreateDt(String createDt) {
                        this.createDt = createDt;
                    }

                    public int getDeathCnt() {
                        return deathCnt;
                    }

                    public void setDeathCnt(int deathCnt) {
                        this.deathCnt = deathCnt;
                    }

                    public int getDecideCnt() {
                        return decideCnt;
                    }

                    public void setDecideCnt(int decideCnt) {
                        this.decideCnt = decideCnt;
                    }

                    public int getSeq() {
                        return seq;
                    }

                    public void setSeq(int seq) {
                        this.seq = seq;
                    }

                    public String getStateDt() {
                        return stateDt;
                    }

                    public void setStateDt(String stateDt) {
                        this.stateDt = stateDt;
                    }

                    public String getStateTime() {
                        return stateTime;
                    }

                    public void setStateTime(String stateTime) {
                        this.stateTime = stateTime;
                    }

                    public String getUpdateDt() {
                        return updateDt;
                    }

                    public void setUpdateDt(String updateDt) {
                        this.updateDt = updateDt;
                    }

                }

                public List<Item> getItem() {
                    return item;
                }

                public void setItem(List<Item> item) {
                    this.item = item;
                }
            }

            public Items getItems() {
                return items;
            }

            public void setItems(Items items) {
                this.items = items;
            }

            public int getNumOfRows() {
                return numOfRows;
            }

            public void setNumOfRows(int numOfRows) {
                this.numOfRows = numOfRows;
            }

            public int getPageNo() {
                return pageNo;
            }

            public void setPageNo(int pageNo) {
                this.pageNo = pageNo;
            }

            public int getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(int totalCount) {
                this.totalCount = totalCount;
            }
        }

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Body getBody() {
            return body;
        }

        public void setBody(Body body) {
            this.body = body;
        }
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}