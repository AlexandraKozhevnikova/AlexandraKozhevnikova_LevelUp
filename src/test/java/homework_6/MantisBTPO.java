package homework_6;

import homework_6.steps.ActivitySteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsLeftSlideMenu;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsNavTabs;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.Users;

import static homework_6.steps.ActivitySteps.clickItemLeftSlideMenus;
import static homework_6.steps.ActivitySteps.clickItemNavTabss;


public class MantisBTPO {

    private ActivitySteps activitySteps;

    @Before
    public void openLogin() {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        activitySteps = new ActivitySteps(driver);

        activitySteps.goToLoginPage();
        activitySteps.loginAsAdministrator();
        clickItemLeftSlideMenus(ItemsLeftSlideMenu.MANAGE);

    }


    @Test
    @Story("Создание проекта")
    @Description("Создание и удаление проекта")
    @Issue("id=2")
    @TmsLink("id=1")
    public void createProject() {
        clickItemNavTabss(ItemsNavTabs.MANAGE_PROJECTS);
        activitySteps.clickCreateProjectButtons();
        activitySteps.fillProjectInformation("KAS", "create new project");
        activitySteps.deleteProject();
    }


    @Test
    @Story("Создание пользователя")
    @Description("Создает пользователя, логинится под созданным пользователем, удалаяет пользователя")
    public void createUser() {
        clickItemNavTabss(ItemsNavTabs.MANAGE_USER);
        activitySteps.clickCreateAccountButtons();
        activitySteps.fillUserInformation(Users.REPORTER);
        activitySteps.clickCreateUserButtons();

        activitySteps.loginNewUser(Users.REPORTER);
        activitySteps.deleteUser(Users.REPORTER);
    }


    @After
    public void logout() {
        activitySteps.logoutClose();
    }
}
