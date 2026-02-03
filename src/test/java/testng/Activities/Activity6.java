package testng.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Objects;

public class Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }
    @Test(enabled = true)
    @Parameters({"userName","password"})
    public void parameterMethod1(String username,String password){
        WebElement userField = driver.findElement(By.xpath("//input[1]"));
        WebElement passField = driver.findElement(By.xpath("//input[2]"));
        userField.sendKeys(username);
        passField.sendKeys(password);
        driver.findElement(By.xpath("//form//button")).click();
        Assert.assertEquals(driver.getTitle(),"Selenium: Login Success!");
    }

    @DataProvider(name = "loginForm")
    public static String[][] credentials(){
        return new String[][]{
                {"admin", "password"},
                {"suryanarayana","surya@123"}
        };
    }

    @Test(dataProvider = "loginForm")
    public void testMethod(String username,String password) {
        WebElement userField = driver.findElement(By.xpath("//input[1]"));
        WebElement passField = driver.findElement(By.xpath("//input[2]"));
        userField.sendKeys(username);
        passField.sendKeys(password);
        driver.findElement(By.xpath("//form//button")).click();
        Assert.assertEquals(driver.getTitle(),"Selenium: Login Success!");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
