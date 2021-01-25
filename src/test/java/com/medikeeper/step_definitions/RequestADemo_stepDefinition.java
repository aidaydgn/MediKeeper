package com.medikeeper.step_definitions;

import com.medikeeper.pages.HomePage;
import com.medikeeper.pages.RequestADemoPage;
import com.medikeeper.utilities.ConfigurationReader;
import com.medikeeper.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class RequestADemo_stepDefinition {

    HomePage homePage = new HomePage();
    RequestADemoPage requestADemoPage = new RequestADemoPage();


    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Given("user clicks Request a Demo")
    public void user_clicks_request_a_demo() {

        homePage.clickOnRequestADemoButton();

    }


    @When("robot user fill out the given form on Request a Demo page")
    public void robotUserFillOutTheGivenFormOnRequestADemoPage() throws InterruptedException {

        requestADemoPage.enterDemoRequestForm();
    }


    /**
     * @And("robot user should not be able to pass the reCAPTCHA")
     * public void robotUserShouldNotBeAbleToPassTheReCAPTCHA() {
     * <p>
     * requestADemoPage.captchaRobotChallenge();
     * }
     */


    @And("robot user clicks Submit button")
    public void robotUserClicksSubmitButton() throws InterruptedException {

        requestADemoPage.clickSubmitButton();

    }


    @When("user fill out the given form with missing required field")
    public void userFillOutTheGivenFormWithMissingRequiredField() {
        requestADemoPage.enterFormWithMissingField();

    }

    @And("user clicks Submit button")
    public void userClicksSubmitButton() throws InterruptedException {
        requestADemoPage.clickSubmitButton();

    }


    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedResult1) throws InterruptedException {
        String actualResult = requestADemoPage.getCaptchaErrorMessage();
        Assert.assertEquals(expectedResult1, actualResult);
    }

    @Then("user should see {string}")
    public void userShouldSee(String expectedResult2) {
        String actualResult = requestADemoPage.getSubmissionErrorMessage();
        Assert.assertEquals(expectedResult2, actualResult);
    }
}