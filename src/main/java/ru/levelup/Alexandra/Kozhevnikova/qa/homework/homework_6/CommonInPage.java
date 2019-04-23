package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

import java.util.concurrent.TimeUnit;

public abstract class CommonInPage extends CommonElements {


    public CommonInPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void goToPage(String url) {
        driver.get(url);
    }

    public static void logout() {
    clickUserMenuUnit();
    clickButtonLogout();
    }

    public void addTimeout(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }









}
