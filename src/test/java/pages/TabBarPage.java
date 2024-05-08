package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabBarPage {
    private final WebDriver driver;

    private final By searchBoxLocator = By.id("searchData");
    private final By basketLocator = By.className("basketTotalNum");
    private final By signUpLocator = By.className("btnSignUp");
    private final By signInLocator = By.className("btnSignIn");

    public TabBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signInButtonClick() {
        driver.findElement(signInLocator).click();
    }
}
