package com.Spartans.stepDefs;

import com.Spartans.utilities.BrowserUtils;
import com.Spartans.utilities.DBUtils;
import com.Spartans.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        BrowserUtils.waitFor(3);

         Driver.closeDriver();

    }

    @Before("@dbConnection")
    public void setUpdb() {
        System.out.println("\tconnecting to database...");
        try{
            DBUtils.createConnection();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("CONNECTION OLUSTURULAMADI");
        }
    }

    @After("@dbConnection")
    public void closeDb() {
        System.out.println("\tdisconnecting to database...");
        DBUtils.destroy();

    }


}
