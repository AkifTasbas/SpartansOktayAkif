package com.Spartans.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpartanDetailPage extends  BasePage{
    @FindBy(xpath = "//a[@href='/spartans']")
    public WebElement backToTheListLink;
}
