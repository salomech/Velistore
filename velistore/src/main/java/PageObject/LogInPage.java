package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
    protected By
       emailField = By.name("email"),
       passwordField = By.id("signin-password"),
//
    logInButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"),
    logInButton2 = By.xpath ("//*[@id=\"portal-root\"]/div[2]/div/div/form/button[2]");
}

