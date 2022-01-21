package jsonex01;

import com.google.gson.Gson;

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
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson();
        String jsonUserDton = gson.toJson(userDto);
        System.out.println(jsonUserDton);

        UserDto javaUserDto = gson.fromJson(jsonUserDton, UserDto.class);
        System.out.println(javaUserDto.getUsername());
        System.out.println(javaUserDto.getPassword());

    }
}
