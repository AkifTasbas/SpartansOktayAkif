package com.Spartans.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSpartansPage extends BasePage {

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//select[@id='genderSelect']")
    public WebElement genderSelectBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement UpdateSpartanButton;
}
