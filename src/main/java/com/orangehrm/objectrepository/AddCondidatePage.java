package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddCondidatePage {

    public WebDriver driver;
    public AddCondidatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = " //button[contains(., 'Add')] ")
    private WebElement addCondidateButton;

    @FindBy(name="firstName")
    private WebElement firstNameField;

    @FindBy(name="middleName")
    private WebElement middleNameField;

    @FindBy(name="lastName")
    private WebElement lastNameField;

    @FindBy(xpath = "//label[text()='Vacancy']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
    private WebElement vacancyFieldDropdown;

    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> vacancyOptionDropdown;

    @FindBy(xpath = "//label[text()='Email']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@placeholder='Type here']")
    private WebElement emailTextField;

    @FindBy(xpath = "//label[text()='Contact Number']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@placeholder='Type here']")
    private WebElement contactNumberTextField;

    @FindBy(xpath = "//div[text()='Browse']")
    private WebElement resumeUploadButton;

    @FindBy(xpath = "//input[@placeholder=\"Enter comma seperated words...\"]")
    private WebElement keywordsTextField;

    @FindBy(xpath = "//input[@placeholder='dd-mm-yyyy']")
    private WebElement fromDateTextField;

    @FindBy(xpath = "//p[text()='December']/ancestor::div[@class='oxd-calendar-wrapper']/descendant::div[text()='11']")
    private WebElement selectFromDateTextField;

    @FindBy(xpath = "//label[text()='Notes']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::textarea[@placeholder='Type here']")
    private WebElement notesTextField;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public WebElement getAddCondidateButton() {
        return addCondidateButton;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getMiddleNameField() {
        return middleNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getVacancyFieldDropdown() {
        return vacancyFieldDropdown;
    }

    public List<WebElement> getVacancyOptionDropdown() {
        return vacancyOptionDropdown;
    }

    public WebElement getEmailTextField() {
        return emailTextField;
    }

    public WebElement getContactNumberTextField() {
        return contactNumberTextField;
    }

    public WebElement getResumeUploadButton() {
        return resumeUploadButton;
    }

    public WebElement getKeywordsTextField() {
        return keywordsTextField;
    }

    public WebElement getFromDateTextField() {
        return fromDateTextField;
    }

    public WebElement getSelectFromDateTextField() {
        return selectFromDateTextField;
    }

    public WebElement getNotesTextField() {
        return notesTextField;
    }

    public WebElement getCheckbox() {
        return checkbox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}

