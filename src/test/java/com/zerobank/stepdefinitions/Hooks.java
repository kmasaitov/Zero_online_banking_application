package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPages;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    //Import from io.cucumber.java not from junit
//    @Before(value = "@login", order = 1)
//    public void setupLoginScenario(){
//        System.out.println("BEFORE--Setting up browser with further details...");
//    }
//
//    @Before ("@db")
//    public void setupScenario(){
//        System.out.println("BEFORE--Setting up browser with further details...");
//    }

    @After
    public void tearDownScenario(Scenario scenario){

        //IF MY SCENARIO FAILS
        // TAKE A SCREENSHOT


        //scenario.isFailed() --> if scenario fails : returns true

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("AFTER--Teardown steps are being applied...");

       Driver.closeDriver();
    }


}
