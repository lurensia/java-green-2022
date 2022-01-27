package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {

    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Code code;
        private Msg msg;
        private Data1 data1;

        @AllArgsConstructor
        @Data
        class Code {
            int code;
        }

        @AllArgsConstructor
        @Data
        class Msg {
            String msg;
        }

        @AllArgsConstructor
        @Data
        class Data1 {
            private int id;
            private String title;
            private String content;
            private User user;
            private String created;
            private String updated;

            @AllArgsConstructor
            @Data
            class User {
                private int id;
                private String username;
                private String password;
                private String email;
                private String created;
                private String updated;
            }
        }
    }
}
