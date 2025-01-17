package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private WebDriver driver;

    // Locators
    private By firstnameInputLocator = By.name("firstname");
    private By lastnameInputLocator = By.name("lastname");
    private By emailInputLocator = By.name("email");
    private By telephoneInputLocator = By.name("telephone");
    private By passwordInputLocator = By.name("password");
    private By confirmpasswordInputLocator = By.name("confirm");
    private By newsletterInputLocator = By.cssSelector("input[value='1'][name='newsletter']");
    private By privacypolicyInputLocator  = By.cssSelector("input[value='1'][name='agree']");
    private By continueInputLocator = By.xpath("//input[@value='Continue']");
    private By myAccountInputLocator = By.linkText("My Account");


    //Constructor
    public RegisterPage (WebDriver driver){
        this.driver = driver;
    }
    public void enterFirstName(String firstname) {
        WebElement emailInput = driver.findElement(firstnameInputLocator);
        emailInput.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        WebElement passwordInput = driver.findElement(lastnameInputLocator);
        passwordInput.sendKeys(lastname);
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }
    public void enterTelephone(String telephone) {
        WebElement emailInput = driver.findElement(telephoneInputLocator);
        emailInput.sendKeys(telephone);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }
    public void enterConfirm(String confirm) {
        WebElement passwordInput = driver.findElement(confirmpasswordInputLocator);
        passwordInput.sendKeys(confirm);
    }
    public void clickNewsLetter() {
        WebElement newsLetter = driver.findElement(newsletterInputLocator);
        newsLetter.click();
    }
    public void clickPrivacyPolicy() {
        WebElement privacyPolicy = driver.findElement(privacypolicyInputLocator);
        privacyPolicy.click();
    }
    public void clickContinueButton() {
        WebElement continueButton = driver.findElement(continueInputLocator);
        continueButton.click();
    }
    public boolean successfulRegister(){

        return driver.findElement(myAccountInputLocator).isDisplayed();
    }
}
