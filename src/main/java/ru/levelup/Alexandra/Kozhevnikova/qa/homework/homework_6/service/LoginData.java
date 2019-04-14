package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service;

import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.List;

public class LoginData {
    private String login;
    private String password;
    private Enum users;


    private LoginData(Enum users, String login, String password) {
        this.password = password;
        this.login = login;
        this.users = users;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    private Enum getUsers() {
        return users;
    }



    public static LoginData getLoginData(Users users) {
        for (LoginData  loginData : loginDataList) {
            if (loginData.getUsers().equals(users)) {
                return  loginData;
            }
        }
        return null;
    }



    private static List<LoginData> loginDataList = Arrays.asList(new LoginData(Users.ADMINISTRATOR, "admin", "admin"),
            new LoginData(Users.REPORTER, "KAS", "123"));





}


