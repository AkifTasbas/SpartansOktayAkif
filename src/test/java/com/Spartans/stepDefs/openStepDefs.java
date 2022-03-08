package com.Spartans.stepDefs;

import com.Spartans.pages.SpartansHomePage;
import com.Spartans.pages.SpartansCrudOperationPage;
import com.Spartans.utilities.BrowserUtils;
import com.Spartans.utilities.ConfigurationReader;
import com.Spartans.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class openStepDefs {

    @Given("The Spartans Webpage must be opened")
    public void the_spartans_webpage_must_be_opened() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }


}
