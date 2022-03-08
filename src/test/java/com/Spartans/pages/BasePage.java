package com.Spartans.pages;

import com.Spartans.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);

    }
}
