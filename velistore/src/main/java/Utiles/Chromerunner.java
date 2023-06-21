package Utiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Chromerunner {
     public static WebDriver driver = new ChromeDriver();
     @BeforeTest
     public void openChrome(){
         driver.manage().window().maximize();
         driver.get("https://veli.store/");
     }

     @AfterTest
     public void closeChrome(){
         driver.close();
     }
}
