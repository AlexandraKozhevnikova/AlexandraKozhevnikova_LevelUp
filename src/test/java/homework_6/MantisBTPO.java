package homework_6;

import homework_6.steps.ActivitySteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages.ManageProjectPage;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsLeftSlideMenu;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsNavTabs;

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
    public void start() {
        clickItemNavTabss(ItemsNavTabs.MANAGE_PROJECTS);
        activitySteps.clickCreateProjectButtons();
        activitySteps.fillProjectInformation("KAS", "create new project");
        activitySteps.deleteProject();

    }


}
