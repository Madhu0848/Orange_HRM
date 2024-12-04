package com.orangehrm.test;

import com.orangehrm.baseutility.BaseClass;
import com.orangehrm.objectrepository.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void testLogin() {
         /*login To The Application*/
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).click();
        driver.findElement(By.xpath("//p[text()='December']/ancestor::div[@class='oxd-calendar-wrapper']/descendant::div[text()='11']")).click();



    }



}
