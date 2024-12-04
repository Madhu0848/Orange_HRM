package com.orangehrm.genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
    @Author Madhuri
 */

public class browserutility {
 /*
    JAVASCRIPT RELATED OPERATION
 */
    public WebDriver driver;
    public void clickOnElementUsingJavaScript(WebElement locator,WebDriver driver) {
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
