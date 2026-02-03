package testng.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class Activity5 {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test(groups = {"title"} )
    public void test1(){
        String title = "Selenium: Target-Practice";
        Assert.assertEquals(driver.getTitle(),title);
    }

    @Test(groups = {"HeaderTest"})
    public void headerTest(){
        String text = "Heading #3";
        WebElement headingElement = driver.findElement(By.xpath("//h3[1]"));
        Assert.assertEquals(headingElement.getText(),text);
    }

    @Test(groups = {"ButtonTest"})
    public void headerTest2(){
        WebElement elementColor = driver.findElement(By.xpath("//h5"));
        String color = elementColor.getCssValue("color");
        Assert.assertEquals(color,"rgb(147, 51, 234)");
    }

    @Test(groups = {"HeaderTest"})
    public void buttonTest(){
        String text = "Emerald";
        WebElement buttonEle = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
        Assert.assertEquals(buttonEle.getText(),text);
    }

    @Test(groups = {"ButtonTest"})
    public void buttonTest1(){
        WebElement elementColor = driver.findElement(By.xpath("//button[contains(text(),'Purple')]"));
        String color = elementColor.getCssValue("color");
        Assert.assertEquals(color,"rgb(88, 28, 135)");
    }

    @AfterClass(alwaysRun = true)
    public void endUp(){
        driver.close();
    }
}
