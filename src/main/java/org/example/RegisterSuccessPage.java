package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util
{
    //Register successfully result


    private By _registerSuccessfulMessage = By.xpath("//div[text()=\"Your registration completed\"]");
    String expectedRegisterSuccessMessage = "Your registration completed";

    public void verifyUserIsOnRegisterResultPage()
    {
        assertURL("registerresult");// checking if is pn register result page

    }
    public void userCanSeeSuccessfulMessage()
    {
        // getting  Your registration completed message
       // assertTextMessage(getTextFromElement(_registerSuccessfulMessage),expectedRegisterSuccessMessage,"user can see successfull message");
        System.out.println(_registerSuccessfulMessage);

        takeScreenShot("jig");

    }

}
