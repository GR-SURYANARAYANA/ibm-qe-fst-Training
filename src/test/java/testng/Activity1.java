package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void beforeClassMethod(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/");
    }

    @Test
    public void testMethod(){
        String title = driver.getTitle();
        Assert.assertEquals("Training Support",title);
    }

    @AfterClass
    public void afterClassMethod(){
        driver.close();
    }
}
