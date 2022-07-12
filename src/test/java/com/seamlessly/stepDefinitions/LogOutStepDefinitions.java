package com.seamlessly.stepDefinitions;

import com.seamlessly.pages.BasePage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }

    @And("User enters valid username")
    public void userEntersValidUsername() {
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.logInButton.click();
    }

    @Then("User lands on files module page")
    public void userLandsOnFilesModulePage() {
        String expectedTitle = "Dashboard - Seamlessly";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("User clicks profile avatar image")
    public void userClicksProfileAvatarImage() {
        loginPage.profileAvatar.click();
    }

    @And("User clicks Log out link from opened menu")
    public void userClicksLogOutLinkFromOpenedMenu() {
        loginPage.logOutLink.click();
    }

    @Then("Log in page should be displayed")
    public void logInPageShouldBeDisplayed() {
        Assert.assertTrue(loginPage.loginPagelogo.isDisplayed());
    }

    @And("User clicks navigate back button on browser")
    public void userClicksNavigateBackButtonOnBrowser() {
        Driver.getDriver().navigate().back();
    }
}
