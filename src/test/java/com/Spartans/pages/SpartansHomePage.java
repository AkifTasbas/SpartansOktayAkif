package com.Spartans.pages;

import com.Spartans.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpartansHomePage extends BasePage {

    @FindBy(xpath = "//i[@class='fas fa-users']")
    public WebElement webDataLink;

    @FindBy(xpath = "//a[@id='total']")
    public WebElement totalNumber;

    public int totalNumberBeforeOperation;

}

