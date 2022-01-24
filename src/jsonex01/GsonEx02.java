package jsonex01;

import com.google.gson.Gson;

//{"groupId":"R2GdEONszq64lNB9","successCount":1,"errorCount":0}

class smsDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public smsDto(String groupId, int successCount, int errorCount) {
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

        // json으로 변형
        smsDto smsDto = new smsDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String JsonsmsDto = gson.toJson(smsDto);
        System.out.println(JsonsmsDto);
        // 자바 오브젝트로 변경
        System.out.println(smsDto.class);
        smsDto javasmsDto = gson.fromJson(JsonsmsDto, smsDto.class);
        System.out.println(javasmsDto.getGroupId());
        System.out.println(javasmsDto.getSuccessCount());
        System.out.println(javasmsDto.getErrorCount());
    }
}

// String smsReturn =
// "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
// System.out.println(smsReturn);
