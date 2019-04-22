package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsLeftSlideMenu;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.service.ItemsNavTabs;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class CommonElements {

    protected  WebDriver driver;

    @FindBy(className = "user-info")
    private static WebElement userMenuUnit;

    @FindBy(xpath = "//i[contains(@class, 'fa-sign-out')]/..")
    private static WebElement buttonLogout;

    @FindBy(xpath = "//ul[contains(@class, 'nav-list')]//li")
    private static List<WebElement> leftSlideMenu;

    @FindBy(css = "div.row li:nth-child(n+2)")
    private static List<WebElement>  navTabs;





    protected CommonElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void clickUserMenuUnit() {
        userMenuUnit.click();
    }

    public static void clickButtonLogout() {
        buttonLogout.click();
    }

    public static void clickItemLeftSlideMenu(ItemsLeftSlideMenu itemsLeftSlideMenu) {
        for (WebElement itemLSM : leftSlideMenu) {
            if (itemLSM.getText().trim().equals(itemsLeftSlideMenu.getValue())) {
                itemLSM.click();
                break;
            }
        }

    }

    public static void clickItemNavTabs(ItemsNavTabs itemsNavTabs) {
        for (WebElement itemNT : navTabs) {
            if (itemNT.getText().trim().equals(itemsNavTabs.getValue())) {
            itemNT.click();
            break;
            }
        }
    }

    public void closeBrowser() {
        driver.quit();
    }














}
