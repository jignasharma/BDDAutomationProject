package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util
{
    private By _clickOnGender = By.xpath("//input[@id=\"gender-female\"]");
    private By _fistName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By  _dateOfMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _dateOfYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _yourEmail = By.xpath("//input[@id=\"Email\"]");
    private By _companyName = By.xpath("//input[@id=\"Company\"]");
    private By _unCheckTickBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _enterYourPassword = By.xpath("//input[@id=\"Password\"]");
    private By _enterConfirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnSubmitButton = By.xpath("//input[@id=\"register-button\"]");


    public void verifyUserIsOnRegisterPage()
    {
        assertURL("register");// verify if the user is on register page

    }
    public void userEnterRegistrationDetails()
    {
        clickOnElement(_clickOnGender);
        typetext(_fistName,"Mina");// user enters first name
        typetext(_lastName,"Sharma");// user enters surname


        selectFromDropDownByVisibleTxt(_dateOfDay,"20");// user selects day of birth

        selectFromDropDownByIndex(_dateOfMonth,2);// user selects month of birth

        selectFromDropDownByValue(_dateOfYear,"1976");// user selects year of bith

        typetext(_yourEmail,"jiya12+"+timestamp()+"@gmail.com");// user adds their emails address
        typetext(_companyName,"Abcltd");// user inputs their company name
        clickOnElement(_unCheckTickBox);// user uncheck the tickbox
        typetext(_enterYourPassword,"mum123");//user enters password
        typetext(_enterConfirmPassword,"mum123");//user enters confirm password
    }
    public void userClickOnSubmitsButton()
    {

        clickOnElement(_clickOnSubmitButton);// user clicks on submit button

    }


}
