package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {
    public static WebDriver driver;

    @BeforeSuite(groups = {"Activity1"})
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Title page of the driver : "+driver.getTitle());
    }
    @AfterSuite(groups = {"Activity1"})
    public void tearDown(){
        driver.close();
    }
}
