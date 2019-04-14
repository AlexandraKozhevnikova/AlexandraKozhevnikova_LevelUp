package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_6.CommonInPage;

public class ManageProjectPage extends CommonInPage {

    @FindBy(xpath = "//button[contains(text(), 'Create New Project')]")
    private WebElement buttonCreateProject;

    @FindBy(id = "project-name")
    private WebElement inputProjectName;

    @FindBy(className = "lbl")
    private WebElement checkboxInheritGlobalCategories;

    @FindBy(id = "project-description")
    private WebElement inputDescription;

    @FindBy(xpath = "//input[@value='Add Project']")
    private WebElement buttonAddProject;


//    @FindBy()
//    private WebElement ;





    public ManageProjectPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateProjectButton() {
        buttonCreateProject.click();
    }

    public void fillName(String projectName) {
        inputProjectName.sendKeys(projectName);
    }

    public void changeCheckboxIHC(){
        checkboxInheritGlobalCategories.click();
    }

    public void fillDescription(String projectDescription) {
        inputDescription.sendKeys(projectDescription);
    }

    public void clickAddProjectButton() {
        buttonAddProject.click();
    }

}
