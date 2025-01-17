package org.opencart.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterPageStepDefinitions {
    private WebDriver driver;
    private RegisterPage registerPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Given("I am on the OpenCart register page")
    public void i_am_on_the_open_cart_register_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        registerPage = new RegisterPage(driver);

    }

    @Given("I have entered a valid details")
    public void i_have_entered_a_valid_details() {
        registerPage.enterFirstName("Sabori");
        registerPage.enterLastName("Das");
        registerPage.enterEmail("sabori.lastserver@gmail.com");
        registerPage.enterTelephone("898942828");
        registerPage.enterPassword("AdminSD123");
        registerPage.enterConfirm("AdminSD123");

    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {
        registerPage.clickNewsLetter();
        registerPage.clickPrivacyPolicy();
        registerPage.clickContinueButton();
    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        // Assert that the current URL contains the password reset page route
        Assert.assertTrue(registerPage.successfulRegister());
    }
}
