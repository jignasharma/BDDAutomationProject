package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.io.File;
import java.io.IOException;

public class Util extends BasePage{

        public static void Sleep1(int n) {
            // Sleep method to get explicit wait
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


            public static void waitUntilElementIsClickable(By by, int time) {
                WebDriverWait wait = new WebDriverWait(driver, time);
                wait.until(ExpectedConditions.elementToBeClickable(by));
            }

            public static void clickOnElement(By by) {
                driver.findElement(by).click();
            }

            public static String getTextFromElement(By by) {
                return driver.findElement(by).getText();

            }

            public static void typetext(By by, String text) {
                driver.findElement(by).sendKeys(text);
            }

            public static void selectFromDropDownByVisibleTxt(By by, String text) {
                Select select = new Select(driver.findElement(by));
                select.selectByVisibleText(text);
            }

            public static void selectFromDropDownByIndex(By by, int n) {
                Select select = new Select(driver.findElement(by));
                select.selectByIndex(n);
            }

            public static void selectFromDropDownByValue(By by, String value) {
                Select select = new Select(driver.findElement(by));
                select.selectByValue(value);
            }

            public static long timestamp()
            {
                return (System.currentTimeMillis());
            }

    public static void assertTextMessage(String actual, String expected, String message)
    {

        Assert.assertEquals(actual, expected, message);
    }

    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }




    public static void takeScreenShot(String fileName)
    {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //The below method will save the screen shot in d drive with test method name
                try
                {
                    FileUtils.copyFile(scrFile, new File("src\\ScreenShot\\" + fileName + ".jpg"));
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


