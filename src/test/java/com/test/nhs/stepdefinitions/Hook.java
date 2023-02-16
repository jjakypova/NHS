package com.test.nhs.stepdefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {

    public WebDriver driver;


    @Before
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("QA_url"));
    }
    @After

    public void tearDown(Scenario scenario){

        BrowserUtils.getScreenShotForCucumber(driver,scenario);
        driver.quit();
    }
}
