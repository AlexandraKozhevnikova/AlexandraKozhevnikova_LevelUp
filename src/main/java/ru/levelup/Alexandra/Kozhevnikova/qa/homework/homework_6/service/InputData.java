//package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//
//public  class InputData {
//
//    Properties properties = new Properties();
//
//    public final static String URL_LOGIN = properties.getProperty("url.login");
//
//
//
//
//
//    private String administratorUsername = properties.getProperty("administrator.username");
//    private String administratorPassword = properties.getProperty("administrator.password");
//    private String reporterUsername = properties.getProperty("reporter.username");
//    private String reporterPassword = properties.getProperty("reporter.password");
//
//
//    public void fjlsfl() {
//        try{
//        properties.load(new FileInputStream(new File("src/main/resources/users.properties")));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//}