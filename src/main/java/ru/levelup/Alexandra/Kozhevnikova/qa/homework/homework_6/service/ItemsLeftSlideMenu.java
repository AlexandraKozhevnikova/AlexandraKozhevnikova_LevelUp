package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service;

public enum ItemsLeftSlideMenu {
    MY_VIEW("My view"),
    VIEW_ISSUE("View issue"),
    REPORT_ISSUE("Report issue"),
    CHANGE_LOG("Change log"),
    ROAD_MAP("Road map"),
    SUMMARY("Summary"),
    MANAGE("Manage");

    private String value;

    ItemsLeftSlideMenu(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
