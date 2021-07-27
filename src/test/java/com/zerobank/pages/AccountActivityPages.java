package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPages {
    public AccountActivityPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (id = "user_login")
         public WebElement username;

    @FindBy (id = "user_password")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy (id = "details-button")
    public WebElement sendAnywayAlert;

    @FindBy (id = "proceed-link")
    public WebElement proceedAnyway;

    @FindBy (linkText = "Savings")
    public WebElement savings;

    @FindBy (linkText = "Brokerage")
    public WebElement brokerage;

    @FindBy (linkText = "Checking")
    public WebElement checking;

    @FindBy (linkText = "Credit Card")
    public WebElement creditCard;

    @FindBy (linkText = "Loan")
    public WebElement loan;

    @FindBy (linkText = "Account Summary")
    public WebElement summaryPage;

    @FindBy (linkText = "Account Activity")
    public WebElement accountActivity;


    @FindBy (id = "aa_accountId")
    public WebElement assertion;
}
