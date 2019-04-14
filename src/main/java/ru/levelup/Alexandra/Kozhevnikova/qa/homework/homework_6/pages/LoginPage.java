package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonInPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.LoginData;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;


public class LoginPage extends CommonInPage {

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonLogin;

    @FindBy(id = "password")
    private WebElement inputPassword;




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginAsUser(Users users) {
        LoginData loginData = LoginData.getLoginData(users);
        inputUsername.sendKeys(loginData.getLogin());
        buttonLogin.click();
        inputPassword.sendKeys(loginData.getPassword());
        buttonLogin.click();
    }








}


