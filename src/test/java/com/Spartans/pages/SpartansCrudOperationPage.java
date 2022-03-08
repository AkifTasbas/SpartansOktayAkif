package com.Spartans.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpartansCrudOperationPage extends BasePage {

    @FindBy(xpath = "//i[@class='fas fa-user-plus']")
    public WebElement addSpartansButton;
    @FindBy(xpath = "//a[@id='edit_spartan_1']")
    public WebElement editSpartanButton;
}
