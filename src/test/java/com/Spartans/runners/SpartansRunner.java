package com.Spartans.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "src/test/resources/features",
        glue = "com/Spartans/stepDefs",
        dryRun = false,
        tags = "@wip"

)
public class SpartansRunner {

}
