package com.seamlessly.pages;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
