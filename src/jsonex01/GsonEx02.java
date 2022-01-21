package jsonex01;

import com.google.gson.Gson;

class SmsUser {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SmsUser(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"groupId":"R2GdEONszq64lNB9","successCount":1,"errorCount":0}
        // String smsReturn = "";
        Gson gson = new Gson();
        // 정보입력
        SmsUser user1 = new SmsUser("R2GdEONszq64lNB9", 1, 0);

        // json object 로 변환
        String smsReturn = gson.toJson(user1);
        // 변환 출력
        System.out.println(smsReturn);

        // SmsUser javaUserDto = gson.fromJson(smsReturn, SmsUser.class);
        // System.out.println(javaUserDto);

    }

}
