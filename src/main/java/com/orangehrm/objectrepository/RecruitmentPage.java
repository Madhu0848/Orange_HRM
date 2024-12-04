package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

   public  WebDriver driver;
   public RecruitmentPage(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitmentText;

   @FindBy(xpath = "//label[text()='Job Title']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
    private WebElement jobTitleDropdown;

   @FindBy(xpath = "//label[text()='Vacancy']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
   private WebElement vacancyDropdown;

   @FindBy(xpath = "//label[text()='Hiring Manager']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
    private WebElement hiringManagerDropdown;

   @FindBy(xpath = "//label[text()='Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
    private WebElement statusDropdown;

   @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement candidateNameTextField;

   @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    private WebElement KeyWordsTextField;

   @FindBy(xpath = "//input[@placeholder='From']")
    private WebElement fromDateTextField;

   @FindBy(xpath = "//p[text()='December']/ancestor::div[@class='oxd-calendar-wrapper']/descendant::div[text()='11']")
    private WebElement selectFromDateTextField;

   @FindBy(xpath = "//input[@placeholder='To']")
    private WebElement toDateTextField;

    @FindBy(xpath = "//p[text()='December']/ancestor::div[@class='oxd-calendar-wrapper']/descendant::div[text()='11']")
    private WebElement selectToDateTextField;

    @FindBy(xpath = "//label[text()='Method of Application']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")
    private WebElement methodOfApplicationDropdown;

    @FindBy(xpath = "//span[text()='Manual']")
    private WebElement selectApplicationTypeDropdown;

    @FindBy(xpath = " //button[contains(. , Search) and @type='submit'] ")
    private WebElement submitButton;

    public WebElement getRecruitmentText() {
        return recruitmentText;
    }

    public WebElement getJobTitleDropdown() {
        return jobTitleDropdown;
    }

    public WebElement getVacancyDropdown() {
        return vacancyDropdown;
    }

    public WebElement getHiringManagerDropdown() {
        return hiringManagerDropdown;
    }

    public WebElement getStatusDropdown() {
        return statusDropdown;
    }

    public WebElement getCandidateNameTextField() {
        return candidateNameTextField;
    }

    public WebElement getKeyWordsTextField() {
        return KeyWordsTextField;
    }

    public WebElement getFromDateTextField() {
        return fromDateTextField;
    }

    public WebElement getSelectFromDateTextField() {
        return selectFromDateTextField;
    }

    public WebElement getToDateTextField() {
        return toDateTextField;
    }

    public WebElement getSelectToDateTextField() {
        return selectToDateTextField;
    }

    public WebElement getMethodOfApplicationDropdown() {
        return methodOfApplicationDropdown;
    }
    public WebElement getSelectApplicationTypeDropdown() {
        return selectApplicationTypeDropdown;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
