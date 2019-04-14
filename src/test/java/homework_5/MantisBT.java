package homework_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

// TODO Формаирование (CTRL + ALT + L)
public class MantisBT {
    private WebDriver driver;


@Before
public void openLogin() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    //    Open test site by URL
    driver.get("http://khda91.fvds.ru/mantisbt/");
    //    Assert Browser title
    assertThat(driver.getTitle(), equalTo("MantisBT"));
    //    Perform login
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    //    Assert User name in the right-top side of screen that user is loggined
    String userName = driver.findElement(By.className("user-info")).getText();
    // TODO Нужно поменять местами "admin" и userName
    assertThat("admin", equalTo(userName));
    //    Assert left side menu
    // TODO Было бы достаточно просто By.className
    List<WebElement> navlist = driver.findElements(By.xpath("//ul[contains(@class, 'nav-list')]//li"));
    List<String> expectedNavList = Arrays.asList(new String[]{"My View",
            "View Issues", "Report Issue", "Change Log",
            "Roadmap", "Summary", "Manage"});
    List<String> actualNavList = new ArrayList<String>();
    for  (WebElement navlists : navlist) {
        actualNavList.add(navlists.getText());
    }
    assertThat(actualNavList, containsInAnyOrder(expectedNavList.toArray(new String[expectedNavList.size()])));
    //    Click "Manage" button at the left side menu
    // TODO Не понятный локатор. Не понятно что именно за 7-ой элемент
    driver.findElement(By.xpath("//ul[contains(@class, 'nav-list')]//li[7]")).click();
}

//Close browser & Logout
@After
public void closeDriver() {
    driver.findElement(By.className("user-info")).click();
    // TODO локтор может быть улучшен
    driver.findElement(By.xpath("//i[contains(@class, 'fa-sign-out')]/..")).click();
    driver.quit();
}


//Add project
@Test
public void addProject() {
    //Click "Manage Projects" button at the top menuon the "Manage MantisBT" page
    // TODO не понятный локатор
    driver.findElement(By.cssSelector("div.row li:nth-child(3)")).click();
    assertThat(driver.getTitle(), equalTo("Manage Projects - MantisBT"));
    //Click "Create New Projects" button
    driver.findElement(By.xpath("//button[contains(text(), 'Create New Project')]")).click();
    //Check fields on the "Add Project" view	"Project Name Status Inherit Global Categories View Status Description"
    List <String> expectedCategory = Arrays.asList(new String[]{"* Project Name", "Status", "Inherit Global Categories",
    "View Status", "Description"});
    List<WebElement> category = driver.findElements(By.className("category"));
    List<String> actualCategory = new ArrayList<>();
    for ( WebElement categories : category) {
        actualCategory.add(categories.getText());
    }
    assertThat(actualCategory, equalTo(expectedCategory));
    //Fill Project inforamtion
    driver.findElement(By.id("project-name")).sendKeys("KAS");
    driver.findElement(By.className("lbl")).click();
    driver.findElement(By.id("project-description")).sendKeys("create new project");
    //Clic Add Project Button
    driver.findElement(By.xpath("//input[@value='Add Project']")).click();
    //Delete created project
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//td//a[contains(text(), 'KAS')]")).click();
    driver.findElement(By.xpath("//input[@value='Delete Project']")).click();
    driver.findElement(By.xpath("//input[@value='Delete Project']")).click();
}



 //Add user
@Test
    public void addUser() {
    //Click "Manage Users" button at the top menuon the "Manage MantisBT" page
    // TODO Не понятный локатор
    driver.findElement(By.cssSelector("div.row li:nth-child(2)")).click();
    //Click "Create New Account" button
    driver.findElement(By.cssSelector(".pull-left > a")).click();
    //Check fields on the "Create New Account" view
    List<String> expectedCategory = Arrays.asList(new String[]{"Username", "Real Name", "E-mail", "Password", "Verify Password",
    "Access Level", "Enabled", "Protected"});
    List<WebElement> category = driver.findElements(By.className("category"));
    List<String> actualCategory = new ArrayList<>();
    for(WebElement categories: category) {
        actualCategory.add(categories.getText());
    }
    assertThat(expectedCategory, equalTo(actualCategory));

    String username = "KAS";
    String password = "123";

    //Fill user inforamtion
    driver.findElement(By.id("user-username")).sendKeys(username);
    driver.findElement(By.id("user-realname")).sendKeys("Kozhevnikova Alexandra");
    driver.findElement(By.id("email-field")).sendKeys("ya@ya.ru");
    driver.findElement(By.id("user-password")).sendKeys(password);
    driver.findElement(By.id("user-verify-password")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Create User']")).click();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // TODO не явный локатор
    driver.findElement(By.cssSelector("div.row li:nth-child(2)")).click();

    //    Logout
    driver.findElement(By.className("user-info")).click();
    // TODO локатор может быть упрощен
    driver.findElement(By.xpath("//i[contains(@class, 'fa-sign-out')]/..")).click();
    //    Login under created user
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.xpath("//input[@type='submit']")).click();

    //Assert User name in the right-top side of screen that user is loggined
    String userName = driver.findElement(By.className("user-info")).getText();
    assertThat(username, equalTo(userName));

    //    Logout
    driver.findElement(By.className("user-info")).click();
    // TODO локатор может быть упрощен
    driver.findElement(By.xpath("//i[contains(@class, 'fa-sign-out')]/..")).click();

    //    Admin login
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='submit']")).click();

    driver.get("http://khda91.fvds.ru/mantisbt/manage_user_page.php");
    //Delete created user
    driver.findElement(By.xpath("//a[contains(text(), 'KAS')]")).click();
    driver.findElement(By.xpath("//input[@value='Delete User']")).click();
    driver.findElement(By.xpath("//input[@value='Delete Account']")).click();
}

}
