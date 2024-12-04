package com.orangehrm.test;

import com.orangehrm.baseutility.BaseClass;
import com.orangehrm.extentutility.ExtentReport;
import com.orangehrm.genericutility.browserutility;
import com.orangehrm.objectrepository.AddCondidatePage;
import com.orangehrm.objectrepository.LoginPage;
import com.orangehrm.objectrepository.RecruitmentPage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(ExtentReport.class)
public class RecruitmentTest extends BaseClass {


    @Test
    public void addCondidateTest() throws InterruptedException {

    /* Login to the application and Add the candidate details */
        System.out.println("login The Application");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        AddCondidatePage addCondidatePage = new AddCondidatePage(driver);
        addCondidatePage.getAddCondidateButton().click();
        addCondidatePage.getFirstNameField().sendKeys("Madhuri");
        addCondidatePage.getMiddleNameField().sendKeys("Kumari");
        addCondidatePage.getLastNameField().sendKeys("Verma");
        addCondidatePage.getVacancyFieldDropdown().click();
        List<WebElement> listOfVacancies = addCondidatePage.getVacancyOptionDropdown();
        for (int i = 0; i < listOfVacancies.size(); i++) {

            String Vacancy_Text = "Software Engineer";
            if (listOfVacancies.get(i).getText().equals(Vacancy_Text)) {
                listOfVacancies.get(i).click();
                break;
            } else
                System.out.println("Vacancy Not Found");

        }
        addCondidatePage.getEmailTextField().sendKeys("admin@admin.com");
        addCondidatePage.getContactNumberTextField().sendKeys("123456789");



    }

    @Test
    public void applicationInitiatedTest() throws InterruptedException {
        /*
             Login The Application And Click On Recruitment option And Fill The All Deatils.
         */
        System.out.println("login The Application");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.getRecruitmentText().click();
        /*SELECT JOB TITLE*/
        WebElement jobTitle = recruitmentPage.getJobTitleDropdown();
        jobTitle.click();
        Thread.sleep(2000);

        List<WebElement> listJobTitle = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (int i = 0; i < listJobTitle.size(); i++) {
            String JobTitle_Text = "Account Assistant";
            if (listJobTitle.get(i).getText().equals(JobTitle_Text)) {
                listJobTitle.get(i).click();
                break;
            } else
                System.out.println("Job Title Not Found");

        }
        /* SELECT VACANCY */
        WebElement jobvacancy = recruitmentPage.getVacancyDropdown();
        jobvacancy.click();
        List<WebElement> listOfVacancies = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (int i = 0; i < listOfVacancies.size(); i++) {

            String Vacancy_Text = "Software Engineer";
            if (listOfVacancies.get(i).getText().equals(Vacancy_Text)) {
                listOfVacancies.get(i).click();
                break;
            } else
                System.out.println("Vacancy Not Found");

        }
        /* SELECT HIRING MANAGER */
        WebElement hiringManager = recruitmentPage.getHiringManagerDropdown();
        hiringManager.click();
        List<WebElement> listOfHiringManager = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (int i = 0; i < listOfHiringManager.size(); i++) {

            String Manager_Text = "Rahul Patil";
            if (listOfHiringManager.get(i).getText().equals(Manager_Text)) {
                listOfHiringManager.get(i).click();
                break;
            } else
                System.out.println("Manager Not Found");

        }
        /* SELECT STATUS */
        WebElement selectStatus = recruitmentPage.getStatusDropdown();
        selectStatus.click();
        List<WebElement> applicationStatus = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (int i = 0; i < applicationStatus.size(); i++) {

            String Manager_Text = "Application Initiated";
            if (applicationStatus.get(i).getText().equals(Manager_Text)) {
                applicationStatus.get(i).click();
                break;
            } else
                System.out.println("Application Not Initiated");

        }
        /*SELECT CANDIDATE NAME*/
        recruitmentPage.getCandidateNameTextField().sendKeys("m");
        Thread.sleep(2000);
        WebElement candidateName = driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-option\"]"));
        candidateName.click();

        /* WRITE THE KEYWORDS */
        recruitmentPage.getKeyWordsTextField().sendKeys("java", "selenium");

        /*SELECT DATE OF APPLICATION */


        recruitmentPage.getFromDateTextField().click();

        recruitmentPage.getSelectFromDateTextField().click();

        Thread.sleep(2000);
        recruitmentPage.getToDateTextField().click();
        Thread.sleep(2000);
        recruitmentPage.getSelectToDateTextField().click();
        recruitmentPage.getMethodOfApplicationDropdown().click();
        recruitmentPage.getSelectApplicationTypeDropdown().click();
        recruitmentPage.getSubmitButton().click();


    }

}

