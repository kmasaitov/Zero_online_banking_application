package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPages;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPages loginPages = new LoginPages();

    @Given("User is in the login page")
    public void user_is_in_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @Then("Users with wrong username or wrong password should not be able to login")
    public void users_with_wrong_username_or_wrong_password_should_not_be_able_to_login() {
        BrowserUtils.sleep(2);
        loginPages.username.sendKeys("wrongUsername");
        BrowserUtils.sleep(2);
        loginPages.password.sendKeys("wrongPassword");
        loginPages.submitButton.click();
    }

    @Then("Users with blank username or wrong password should not be able to login")
    public void users_with_blank_username_or_wrong_password_should_not_be_able_to_login() {
        loginPages.username.sendKeys("");
        loginPages.password.sendKeys("");
        loginPages.submitButton.click();
    }


    @Then("User should see error message {string} should be displayed")
    public void user_should_see_error_message_should_be_displayed(String string) {
      //  Assert.assertTrue(loginPages.failedCredentials.isDisplayed());
        Assert.assertEquals(loginPages.failedCredentials.getText(), string);
    }

    @Then("Users with correct username or wrong password should be able to login")
    public void users_with_correct_username_or_wrong_password_should_not_be_able_to_login() {
        loginPages.username.sendKeys("username");
        loginPages.password.sendKeys("password");
        loginPages.submitButton.click();

        loginPages.sendAnywayAlert.click();
        BrowserUtils.waitForVisibility(loginPages.proceedAnyway, 5);
        loginPages.proceedAnyway.click();
    }

    @And("Account summary page should be displayed")
    public void accountSummaryPageShouldBeDisplayed() {
        Assert.assertTrue(loginPages.accountActivity.isDisplayed());
    }
}
