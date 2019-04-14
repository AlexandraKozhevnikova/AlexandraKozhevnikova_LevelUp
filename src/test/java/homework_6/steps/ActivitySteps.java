package homework_6.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.LoginPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.ManageProjectPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsLeftSlideMenu;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsNavTabs;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonElements.clickItemLeftSlideMenu;
import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonElements.clickItemNavTabs;


public class ActivitySteps {

    private LoginPage loginPage;
    private ManageProjectPage manageProjectPage;


    public ActivitySteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        manageProjectPage = new ManageProjectPage(driver);


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
        clickItemNavTabs(ItemsNavTabs.MANAGE_PROJECTS);
    }

    @Step("Кликнуть на копку создания проекта")
    public void clickCreateProjectButtons() {
        manageProjectPage.clickCreateProjectButton();
    }

    @Step("Заполнить поля проекта")
    public void fillProjectInformation(String projectName, String projectDescription) {
        manageProjectPage.fillName(projectName);
        manageProjectPage.changeCheckboxIHC();
        manageProjectPage.fillDescription(projectDescription);
        manageProjectPage.clickAddProjectButton();
    }






}
