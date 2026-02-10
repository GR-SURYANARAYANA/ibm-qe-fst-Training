import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity4 extends BaseClass {
    @Test(groups = {"activity4"})
    public void secondMostPopularCourse(){
        String expectedTest = "Email Marketing Strategies";
        String actualTest = driver.findElement(By.xpath("//article[contains(@id,'71')]//h3")).getText();
        Assert.assertEquals(actualTest,expectedTest);
    }
}
