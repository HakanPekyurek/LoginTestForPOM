package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    private final WebDriver driver;

    private final By registerButtonLocator = By.className("register-button");
    private final By emailTextBoxLocator = By.id("email");
    private final By passwordTextBoxLocator = By.id("password");
    private final By forgotPasswordButtonLocator = By.id("forgotPassword");
    private final By loginButtonLocator = By.id("loginButton");
    private final By signInPageHeaderTextLocator = By.className("card-header__text");
    private final By googleLoginButtonLocator = By.className("google-login-btn");
    private final By facebookLoginButtonLocator = By.cssSelector("div[class='facebook_large medium facebookBtn  btnLogin']");
    private final By appleLoginButtonLocator = By.className("apple-login-btn");


    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public String getHeaderText(){
        return driver.findElement(signInPageHeaderTextLocator).getText();
    }

    public void enterEmailAdress(String emailAdress){
        driver.findElement(emailTextBoxLocator).sendKeys(emailAdress);
    }

    public void enterPassword(String password){
        driver.findElement(passwordTextBoxLocator).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }
}
