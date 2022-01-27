package testapp;

import lombok.*;

@Data
@AllArgsConstructor
public class DataPost {
    private int id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;

    @Data
    @AllArgsConstructor
    public class User {
        private int id;
        private String username;
        private String password;
        private String email;
        private String created;
        private String updated;
    }
}
