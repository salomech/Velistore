package StepObj;

import Pageobj.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchSteps extends SearchPage {
    WebDriver driver ;

    public SearchSteps(WebDriver driver2){
        driver = driver2;

    }
    public void searchButton(String correctSearchData){driver.findElement(searchButton).sendKeys(correctSearchData);}








}
