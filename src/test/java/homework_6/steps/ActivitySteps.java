package homework_6.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.LoginPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.ManageProjectPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.ManageUserPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsLeftSlideMenu;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsNavTabs;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonElements.*;
import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonElements.clickButtonLogout;


public class ActivitySteps {

    private LoginPage loginPage;
    private ManageProjectPage manageProjectPage;
    private ManageUserPage manageUserPage;


    public ActivitySteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        manageProjectPage = new ManageProjectPage(driver);
        manageUserPage = new ManageUserPage(driver);


    }


    @Step("Переход на страницу авторизации")
    public void goToLoginPage() {
        loginPage.goToPage("http://khda91.fvds.ru/mantisbt/");
    }

    @Step("Залогинится под Администратором")
    public void loginAsAdministrator() {
        loginPage.loginAsUser(Users.ADMINISTRATOR);
    }

    @Step("Перейти в раздел '{0}'")
    public static void clickItemLeftSlideMenus(ItemsLeftSlideMenu itemsLeftSlideMenu) {
        clickItemLeftSlideMenu(ItemsLeftSlideMenu.MANAGE);
    }

    @Step("Перейти в раздел '{0}'")
    public static void clickItemNavTabss(ItemsNavTabs itemsNavTabs) {
        clickItemNavTabs(itemsNavTabs);
    }

    @Step("Кликнуть на копку создания проекта")
    public void clickCreateProjectButtons() {
        manageProjectPage.clickCreateProjectButton();
    }

    @Step("Кликнуть на кнопку создания пользователя")
    public void clickCreateUserButtons() {
        manageUserPage.clickCreateUserButton();

    }

    @Step("Кликнуть на кнопку создания аккаунта")
    public void clickCreateAccountButtons(){
        manageUserPage.clickCreateAccountButton();
    }

    @Step("Создать проект '{0}'")
    public void fillProjectInformation(String projectName, String projectDescription) {
        manageProjectPage.fillName(projectName);
        manageProjectPage.changeCheckboxIHC();
        manageProjectPage.fillDescription(projectDescription);
        manageProjectPage.clickAddProjectButton();

    }

    @Step("Создать пользователя '{0}'")
    public void fillUserInformation(Users user) {
        manageUserPage.fillName(user);
        manageUserPage.fillPassword(user);
        manageUserPage.fillVerifyPassword(user);
    }

    @Step("Удалить проект KAS")
    public void deleteProject() {
        manageProjectPage.openProject();
        manageProjectPage.deleteProject();
    }

    @Step
    public void deleteUser(Users user){
        manageUserPage.deleteUser();
        manageUserPage.deleteUser();

    }

    @Step("Разлогинится и закрыть браузер")
    public void logoutClose() {
        clickUserMenuUnit();
        clickButtonLogout();
        manageProjectPage.closeBrowser();


    }


}
