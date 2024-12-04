package com.orangehrm.genericutility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

    public String getDataFromExcel(String sheetName , int rowNum,int cellNum) throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\Guru99_Project\\src\\main\\commandata\\application(1).xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        String data=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

        System.out.println("data : " +data );
        return data;


    }

    public static class browserutility {
     /*
        JAVASCRIPT RELATED OPERATION
     */
        public WebDriver driver;
        public void clickOnElementUsingJavaScript(WebElement locator, WebDriver driver) {
            JavascriptExecutor jse=(JavascriptExecutor)driver ;
            jse.executeScript("arguments[0].click();", locator);
        }
        public void scrollByJavascript(WebDriver driver ) {
                JavascriptExecutor jse=(JavascriptExecutor)driver ;
                jse.executeScript("window.scrollBy(0,100)");

        }
        public void mouseOverAction(WebDriver driver,WebElement locator) {
            Actions action = new Actions(driver);
            action.moveToElement(locator);

        }
        public void clickAndHoldAction(WebDriver driver,WebElement locator) {
            Actions action = new Actions(driver);
            action.moveToElement(locator);
        }

    }
}
