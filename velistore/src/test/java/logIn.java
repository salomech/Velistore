import StepObject.LogInSteps;
import Utiles.Chromerunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LogInData.*;

public class logIn extends Chromerunner {
@Test
    public void  logInWithIncorrectData() throws InterruptedException {


    LogInSteps step1 = new LogInSteps(driver);
    step1.logInButton();

   //fsdf

    LogInSteps step2 = new LogInSteps(driver);
    step2.emailInput(incorrectEmailData);
    step2.passwordInput(incorrectPasswordData);

    LogInSteps step3 = new LogInSteps(driver);
    step3.logInButton2();


    Thread.sleep(5000);




    }
}
