package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util

{
    public static void setBrowser()

    {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");
        String url     = loadProp.getProperty("url");

        if(browser.equalsIgnoreCase("Chrome")) {
            // set browser method to help reuse it
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe");

           driver = new InternetExplorerDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);


    }
    public  static  void setCloseBrowser()
    {
        // close the browser once the test been run as it wont open many tabs
        driver.close();

    }

}