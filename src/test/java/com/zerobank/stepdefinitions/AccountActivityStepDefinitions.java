package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPages;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActivityStepDefinitions {

    AccountActivityPages pages = new AccountActivityPages();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        pages.username.sendKeys("username");
        pages.password.sendKeys("password");
        pages.submitButton.click();

        pages.sendAnywayAlert.click();
        BrowserUtils.waitForVisibility(pages.proceedAnyway, 5);
        pages.proceedAnyway.click();
    }


    @When("the user clicks on	Savings link on the Account Summary	page")
    public void theUserClicksOnSavingsLinkOnTheAccountSummaryPage() {
        pages.savings.click();
        BrowserUtils.sleep(3);
    }

    @Then("the Account Activity page should be displayed")
    public void theAccountActivityPageShouldBeDisplayed() {
    }

    @When("the user clicks on	Brokerage link on the Account Summary page")
    public void theUserClicksOnBrokerageLinkOnTheAccountSummaryPage() {
    }

    @When("the user clicks on	Checking link on the Account Summary page")
    public void theUserClicksOnCheckingLinkOnTheAccountSummaryPage() {
    }

    @When("the user clicks on Credit card	link on the Account	Summary	page")
    public void theUserClicksOnCreditCardLinkOnTheAccountSummaryPage() {
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void theUserClicksOnLoanLinkOnTheAccountSummaryPage() {
    }

    @And("Account	drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String arg0) {
    }
}
