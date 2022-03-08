package com.Spartans.stepDefs;

import com.Spartans.pages.AddSpartanPage;
import com.Spartans.pages.SpartanDetailPage;
import com.Spartans.pages.SpartansCrudOperationPage;
import com.Spartans.pages.SpartansHomePage;
import com.Spartans.utilities.BrowserUtils;
import com.Spartans.utilities.DBUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.sql.*;

public class AddSpartansStepDefs {
    SpartansHomePage spartansHomePage = new SpartansHomePage();

    @Then("User clicks the Web Data link")
    public void user_clicks_the_web_data_link() throws SQLException {
        String spartanQuery = "Select count(*) from spartans";
        Object beforeRowNum = null;
        try {

            int cellValue = Integer.valueOf(DBUtils.getCellValue(spartanQuery).toString());

            System.out.println("cellValue = " + cellValue);

            //spartansHomePage.totalNumberBeforeOperation = beforeRowNum;


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("User Clickt to web data link de problem var");
        }
        spartansHomePage.webDataLink.click();
        System.out.println("beforeRowNum = " + beforeRowNum);


    }

    @Then("User clicks add a new spartan button")
    public void user_clicks_add_a_new_spartan_button() {
        BrowserUtils.waitFor(3);
        SpartansCrudOperationPage spartansPage = new SpartansCrudOperationPage();
        spartansPage.addSpartansButton.click();

    }

    @Then("User fills the necessary information for new Spartan and clicks the submit button")
    public void user_fills_the_necessary_information_for_new_spartan_and_clicks_the_submit_button() {
        AddSpartanPage addSpartanPage = new AddSpartanPage();
        addSpartanPage.nameInputBox.sendKeys("HeroSpartan");
        addSpartanPage.phoneInputBox.sendKeys("323232323232");
        Select genderSelect = new Select(addSpartanPage.genderSelectBox);
        genderSelect.selectByVisibleText("Male");
        addSpartanPage.submitButton.click();
    }

    @Then("User clicks to back_to_list link")
    public void user_clicks_to_back_to_list_link() {
        SpartanDetailPage spartanDetailPage = new SpartanDetailPage();
        spartanDetailPage.backToTheListLink.click();
    }


    @Then("the total of the records have to be chanced on JDBC")
    public void the_total_of_the_records_have_to_be_chanced_on_jdbc() throws SQLException {
        String spartanQuery = "Select count(*) from spartans";
        int afterRowNum = Integer.valueOf(DBUtils.getCellValue(spartanQuery).toString());
        int beforeRowNum = spartansHomePage.totalNumberBeforeOperation;
        Assert.assertTrue(afterRowNum > beforeRowNum);
    }


}
