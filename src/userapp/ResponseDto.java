package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private Data data;
    private String Msg;
    private int code;

    @AllArgsConstructor
    class Data {
        private int code;// 1 성공. -1 실패. 0은 데이터 없음
        private String username;
        private String password;
        private String email;
        private String created;
        private String updates;

    }
}
