package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter, Setter, toString
@AllArgsConstructor // user(int id, String username , .... ) 을 만들어준다!
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;

}
