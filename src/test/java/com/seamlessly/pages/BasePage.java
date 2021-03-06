package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@data-id='files']//a)[1]")
    public WebElement filesModuleLink;

    @FindBy(xpath = "//img[@width='32']")
    public WebElement profileAvatar;

    @FindBy(xpath = "//li[@data-id='logout']//a")
    public WebElement logOutLink;





}
