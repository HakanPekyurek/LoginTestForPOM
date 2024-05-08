package com.LoginTestforPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.TabBarPage;

public class LoginTest extends BaseTest {
    TabBarPage tabBarPage;
    SignInPage signInPage;

    @Test(priority = 1)
    public void clickLoginButton() {
        driver.get("https://www.n11.com/");
        tabBarPage = new TabBarPage(driver);
        tabBarPage.signInButtonClick();
    }

    @Test(priority = 2)
    public void controlLoginPage() {
        signInPage = new SignInPage(driver);
        String headerText = signInPage.getHeaderText();
        softAssert.assertTrue(headerText.startsWith("Merhaba"));
    }

    @Test(priority = 3)
    public void Login() {
        signInPage = new SignInPage(driver);
        signInPage.enterEmailAdress("example@email.com");
        signInPage.enterPassword("123456");
        signInPage.clickLoginButton();
    }
}

