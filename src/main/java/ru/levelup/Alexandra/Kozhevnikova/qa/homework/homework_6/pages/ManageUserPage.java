package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonInPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.LoginData.getLoginData;

public class ManageUserPage extends CommonInPage {


    @FindBy(xpath = "//a[contains(text(), 'Create New Account')]")
    private WebElement buttonCreateAccount;

    @FindBy(id = "user-username")
    private WebElement inputUserName;

    @FindBy(id = "user-realname")
    private WebElement inputRealName;

    @FindBy(id = "email-field")
    private WebElement inputEmail;

    @FindBy(id = "user-password")
    private WebElement inputPassword;

    @FindBy(id = "user-verify-password")
    private WebElement inputVerifyPassword;

    @FindBy(id = "user-enabled")
    private WebElement checkboxUserEnabled;


    @FindBy(xpath = "//input[@value='Create User']")
    private WebElement buttonCreateUser;


    @FindBy(xpath = "//td//a[contains(text(), 'KAS')]")
    private WebElement stringUser;

    @FindBy(xpath = "//input[contains(@value, 'Delete')]")
    private WebElement buttonDeleteUser;

    @FindBy(id = "search")
    private WebElement inputSearch;

    @FindBy(xpath ="//input[@value ='Apply Filter']")
    private WebElement buttonAplayFilter;



    public ManageUserPage(WebDriver driver) {
        super(driver);
    }


    public void fillName(Users user) {
        inputUserName.sendKeys(getLoginData(user).getLogin());
    }

    public void fillPassword(Users user) {
        inputPassword.sendKeys(getLoginData(user).getPassword());
    }

    public void fillVerifyPassword(Users user) {
    inputVerifyPassword.sendKeys(getLoginData(user).getPassword());
    }

    public void clickCreateUserButton() {
        buttonCreateUser.click();
        addTimeout(10);
    }

    public void clickCreateAccountButton() {
        buttonCreateAccount.click();
    }



    public void deleteUser() {
        buttonDeleteUser.click();
        buttonDeleteUser.click();
    }

    public void searchUser(Users user) {
        inputSearch.sendKeys(getLoginData(user).getLogin());
        buttonAplayFilter.click();
        stringUser.click();


    }


}
