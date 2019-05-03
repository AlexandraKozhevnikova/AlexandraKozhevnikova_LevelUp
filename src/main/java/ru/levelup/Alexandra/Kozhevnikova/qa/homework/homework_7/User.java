package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {

    private String username;
    private String password;
    @JsonProperty("protected")
    private boolean userProtected;


    public User(String username, String password, boolean userProtected) {
        this(username, password);
        this.userProtected = userProtected;
    }

    public User(String username, String password) {
//        this(username, password, false);
        this.username = username;
        this.password = password;
    }
}
