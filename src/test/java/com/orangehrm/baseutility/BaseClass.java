package com.orangehrm.baseutility;

import com.orangehrm.genericutility.FileUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;


public class BaseClass {

    FileUtility fLib = new FileUtility();
    public WebDriver driver ;
    @BeforeClass
    public void launchBrowser() throws IOException {
        System.out.println("launch The Browser");
        String BROWSER=fLib.getDataFromFile("browser");
        String URL=fLib.getDataFromFile("url");

        if(BROWSER.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (BROWSER.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else {
            driver = new ChromeDriver();
        }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(URL);

        }

    }

