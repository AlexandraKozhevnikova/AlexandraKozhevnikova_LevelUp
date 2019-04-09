package PracticeSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;


public class SeleniumTest {

    /**
     * 1. Открыть MantisBT: http://khda91.fvds.ru/mantisbt/
     * 2. Авторизоваться admin:admin
     * 3. Проверить, что пользователь авторизован
     * 4. Открыть пункт меню "Manage"
     * 5. Выбрать вклатку "Manage Tags"
     * 6. Создать произвольный тег
     * 7. Проверить, что тег добавлен
     * 8. Выйти из учётной записи
     * 9. Закрыть браузер
     */


    private WebDriver driver;
    private ChromeOptions options;

    @BeforeSuite
    public void setUpSuite(){
        WebDriverManager.chromedriver().setup();
    }


    @BeforeClass
    public void lsdf() {
        options = new ChromeOptions();
        options.addArguments("--lang=en");
    }


    @BeforeMethod
    public void khhjhjhk() {
        driver = new ChromeDriver(options);
        driver.get("http://khda91.fvds.ru/mantisbt/"); //переход на сайт
    }


    @Test
    public void addTagsTest() {


        driver.findElement(By.id("username")).sendKeys("admin"); //Ввести админ
        driver.findElement(By.xpath("//input[@value='Login']")).click(); //Нажать кнопку Войти
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("admin"); //ввести пароль
        driver.findElement(By.xpath("//input[@value='Login']")).click(); //Нажать кнопку Войти
        driver.findElement(By.className("user-info")).click();
        driver.findElement(By.partialLinkText("Manage")).click();
        driver.findElement(By.linkText("Manage Tags")).click();

        String tagName = RandomStringUtils.randomAlphabetic(10); //генерит
        driver.findElement(By.id("tag-name")).sendKeys("Test Auto");
        driver.findElement(By.name("config-name")).click();

       //  assertThat();
        List<WebElement> jksdhkjhdkfhsd = driver.findElements(By.xpath("//div[@class='table-responsive']//tr//a"));

          List<String> actualNV = new ArrayList<>();




    }



    @AfterMethod
    public void kill(){
        driver.close();
    }


}