package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util
{
    private By _clickOnSearchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");
    private By _registerButton      = By.className("ico-register");
    private By _welcomeTileText     = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expected                 = "Welcome to our store";

    public void verifyUserIsOnHomepage()
    {
        // verifying if user is on home page
        assertTextMessage(getTextFromElement(_welcomeTileText),expected,"user on home page");
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton);// user clicks on register button
    }
}
