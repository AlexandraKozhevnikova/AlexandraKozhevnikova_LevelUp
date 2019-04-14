package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service;

public enum Users {
    ADMINISTRATOR("Admin"),
    REPORTER("Reporter");

    private String value;

    Users(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
