package Activities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 extends BaseClass {
    @Test(groups = {"Activity4"})
    public void secondMostPopularCourse(){
        String expectedTest = "Email Marketing Strategies";
        String actualTest = driver.findElement(By.xpath("//article[contains(@id,'71')]//h3")).getText();
        Assert.assertEquals(actualTest,expectedTest);
    }
}
