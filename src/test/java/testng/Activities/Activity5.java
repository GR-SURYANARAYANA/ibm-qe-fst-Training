package testng.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    public void buttonTest(){
        String text = "emrald";
        WebElement buttonEle = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
        Assert.assertEquals(buttonEle.getText(),text);
    }
    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.xpath("//button[contains(@class, 'emerald')]"));
        Assert.assertEquals(button1.getText(), "Emerald");
    }

    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
    public void ButtonTest2() {
        Color button2Color = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
    }



    @AfterClass(alwaysRun = true)
    public void endUp(){
        driver.close();
    }
}
