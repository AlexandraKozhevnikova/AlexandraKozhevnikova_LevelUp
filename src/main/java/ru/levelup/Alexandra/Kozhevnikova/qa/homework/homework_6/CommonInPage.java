package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

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

    public void logout() {
    clickUserMenuUnit();
    clickButtonLogout();
    }







}
