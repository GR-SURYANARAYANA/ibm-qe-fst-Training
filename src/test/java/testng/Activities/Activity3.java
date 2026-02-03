package testng.Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
    }


    @AfterClass
    public void endUp(){
        driver.close();
    }
}
