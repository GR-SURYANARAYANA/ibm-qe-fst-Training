package testng.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    @Test(priority = 1)
    public void checkTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Selenium: Target Practice",title);
    }

    @Test(priority = 2)
    public void checkBlackButton() throws Exception{
        WebElement getBlackButton= null;
            try{
                getBlackButton = driver.findElement(By.xpath("//button[contains(@class,'black')]"));
            } catch (Exception e) {
                Assert.assertNull(getBlackButton);
            }
    }
    @Test(enabled = false)
    public void skipTests(){
        System.out.println("test case is skipped..!! ");
    }

    @Test
    public void skipExceptionCheck() throws SkipException{
//        String title = driver.getTitle();
//        if(title.contentEquals("Selenium: Target Practice")){
//            throw new SkipException("Skipping this part");
//        }else{
//            System.out.println("Yes all working well..!!");
//        }
    }

    @AfterClass
    public void endSetUp(){
        driver.close();
    }

}
