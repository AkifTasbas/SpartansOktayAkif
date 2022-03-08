package com.Spartans.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSpartanPage extends BasePage {

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//select[@id='genderSelect']")
    public WebElement genderSelectBox;

    @FindBy(xpath = "//input[@id='submit_btn']")
    public WebElement submitButton;




}
