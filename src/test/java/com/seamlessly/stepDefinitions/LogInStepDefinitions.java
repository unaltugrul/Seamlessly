package com.seamlessly.stepDefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Map;

public class LogInStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Before
    public void userOnTheLoginPage(){

    }

    @And("User enters valid username {string}")
    public void user_enters_valid_username(String string) {
        loginPage.usernameInputBox.sendKeys(string);
    }
    @And("User enters valid password {string}")
    public void user_enters_valid_password(String string) {
        loginPage.passwordInputBox.sendKeys(string);
    }

    @Given("User clicks enter key")
    public void user_clicks_enter_key() {
        loginPage.passwordInputBox.sendKeys("" + Keys.ENTER);

    }
    @Given("User enters invalid username")
    public void user_enters_invalid_username(Map<String,String> invalidUsername) {
        loginPage.usernameInputBox.sendKeys(invalidUsername.get("username"));
    }
    @Given("User enters invalid password")
    public void user_enters_invalid_password(Map<String,String> invalidPassword) {
       loginPage.passwordInputBox.sendKeys(invalidPassword.get("password"));
    }
    @Then("User can not log in")
    public void user_can_not_log_in() {
        String expectedTitle = "Seamlessly";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User should be able to see the error message on input box as expected")
    public void user_should_be_able_to_see_the_error_message_on_input_box_as_expected() {
        String actualMessage = Driver.getDriver().findElement(By.id("user")).getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Then("User should be able to see the error message on password box as expected")
    public void user_should_be_able_to_see_the_error_message_on_password_box_as_expected() {
        String actualMessage = Driver.getDriver().findElement(By.id("password")).getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Then("User should be able to see the password in a form dots")
    public void user_should_be_able_to_see_the_password_in_a_form_dots() {
        Assert.assertEquals(loginPage.passwordInputBox.getAttribute("type"),"password");
    }

    @And("User clicks the eye icon")
    public void user_clicks_the_eye_icon() {
        loginPage.eyeLink.click();
    }
    @Then("User should be able to see password as a text")
    public void user_should_be_able_to_see_password_as_a_text() {
        Assert.assertEquals(loginPage.passwordInputBox.getAttribute("type"),"text");
    }

    @Then("User should be able to see forgot password link")
    public void user_should_be_able_to_see_forgot_password_link() {
        Assert.assertTrue(loginPage.forgotPasswordLink.isDisplayed());
    }
    @Then("User Click the forgot password link")
    public void user_click_the_forgot_password_link() {
        loginPage.forgotPasswordLink.click();
    }
    @Then("User should be able to see Reset Password button")
    public void user_should_be_able_to_see_reset_password_button() {
        Assert.assertTrue(loginPage.resetPasswordButton.isDisplayed());
    }

    @Then("User should be able to see valid placeholders")
    public void user_should_be_able_to_see_valid_placeholders() {
       String expectedUsernamePlaceholder = "Username or email";
       String actualUsernamePlaceholder = loginPage.usernameInputBox.getAttribute("placeholder");
       Assert.assertEquals(expectedUsernamePlaceholder,actualUsernamePlaceholder);
       String expectedPasswordPlaceholder = "Password";
       String actualPasswordPlaceholder = loginPage.passwordInputBox.getAttribute("placeholder");
       Assert.assertEquals(expectedPasswordPlaceholder,actualPasswordPlaceholder);
    }


}
