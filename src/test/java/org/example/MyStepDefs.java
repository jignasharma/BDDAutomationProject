package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    @Given("^user is already on homepage$")
    public void user_is_already_on_homepage()
    {
        homePage.verifyUserIsOnHomepage();


    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()
    {
        homePage.clickOnRegisterButton();

    }

    @And("^user enter all required registration details$")
    public void user_enter_all_required_registration_details()
    {
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.userEnterRegistrationDetails();

    }

    @And("^user clicks on register submit button$")
    public void user_clicks_on_register_submit_button()
    {
        registerPage.userClickOnSubmitsButton();

    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()
    {
       // registerSuccessPage.verifyUserIsOnRegisterResultPage();
        registerSuccessPage.userCanSeeSuccessfulMessage();

    }


}
