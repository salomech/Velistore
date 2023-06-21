package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class LogInSteps extends LogInPage {
    WebDriver driver;

    public LogInSteps(WebDriver driver1){
        driver = driver1;

    }
    public void logInButton(){
        driver.findElement(logInButton).click();
    }


    public void emailInput(String a) {
        driver.findElement(emailField).sendKeys(a);
    }

    public void passwordInput(String a){
        driver.findElement(passwordField).sendKeys(a);
    }

    public void logInButton2() {
        driver.findElement(logInButton2).click();
    }

//ამის ლოგიკის არსებობა თუ საჭიროა ამ შემთხვევაში
    public  LogInSteps logInButton2 (WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logInButton2)).click();
        return  this;
    }




}





