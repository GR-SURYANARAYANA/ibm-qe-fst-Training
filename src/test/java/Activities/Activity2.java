import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass{
    @Test(groups = {"Activity2"})
    public void checkHeading(){
        String expectedText = "Learn from Industry Experts";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
}
