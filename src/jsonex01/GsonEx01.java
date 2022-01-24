package jsonex01;

import com.google.gson.Gson;

/**
 * Dto => Data Transper object
 */
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class GsonEx01 {
    public static void main(String[] args) {
        // 자바오브젝트 를 Json으로 변경(데이터전송목적)
        UserDto userDto = new UserDto("sar", "1234");
        Gson gson = new Gson();
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // json을 자바오브젝트로 변경(데이터 다운로드목적)
        System.out.println(UserDto.class);
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(javaUserDto.getUsername());
        System.out.println(javaUserDto.getPassword());
    }
}
