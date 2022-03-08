package com.Spartans.stepDefs;

import com.Spartans.pages.AddSpartanPage;
import com.Spartans.pages.EditSpartansPage;
import com.Spartans.pages.SpartanDetailPage;
import com.Spartans.pages.SpartansCrudOperationPage;
import com.Spartans.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class EditSpantansStepDefs extends BaseStepDefs {

    EditSpartansPage editSpartansPage=new EditSpartansPage();
    SpartansCrudOperationPage spartansCrudOperationPage=new SpartansCrudOperationPage();
    SpartanDetailPage spartanDetailPage=new SpartanDetailPage();

    @Then("User clicks edit spartan button")
    public void user_clicks_edit_spartan_button() {
        spartansCrudOperationPage.editSpartanButton.click();
        BrowserUtils.waitFor(3);
        editSpartansPage.nameInputBox.clear();
        editSpartansPage.nameInputBox.sendKeys("Edited Name");
        BrowserUtils.waitFor(3);
        Select genderSelect = new Select(editSpartansPage.genderSelectBox);
        genderSelect.selectByVisibleText("Female");
        BrowserUtils.waitFor(3);
        editSpartansPage.phoneInputBox.clear();
        editSpartansPage.phoneInputBox.sendKeys("1111111111");
        BrowserUtils.waitFor(3);
        editSpartansPage.UpdateSpartanButton.click();


    }

   /* @Then("the edited Spartan of the records have to be chanced on JDBC")
    public void the_edited_spartan_of_the_records_have_to_be_chanced_on_jdbc() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/
}
