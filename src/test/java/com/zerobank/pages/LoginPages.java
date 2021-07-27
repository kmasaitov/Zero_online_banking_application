package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    public LoginPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy (id = "user_password")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy (id = "details-button")
    public WebElement sendAnywayAlert;

    @FindBy (id = "proceed-link")
    public WebElement proceedAnyway;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement failedCredentials;

    @FindBy (xpath = "//a[.='Account Summary']")
    public WebElement accountActivity;

}
