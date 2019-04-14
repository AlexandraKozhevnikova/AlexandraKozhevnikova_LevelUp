package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service;

public enum ItemsNavTabs {
    MANAGE_USER("Manage Users"),
    MANAGE_PROJECTS("Manage Projects"),
    MANAGE_TAGS("Manage Tags"),
    MANAGE_CUSTOM_FIELDS("Manage Custom Fields"),
    MANAGE_GLOBAL_PROFILES("Manage Global Profiles"),
    MANAGE_PLUGINS("Manage Plugins"),
    MANAGE_CONFIGURATION("Manage Configuration");

    private String value;


    ItemsNavTabs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
