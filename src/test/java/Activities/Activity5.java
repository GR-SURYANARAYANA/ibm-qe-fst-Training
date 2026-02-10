package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass {

    @Test(groups= {"Activity6"}, dependsOnGroups = {"Activity1"})
    public void navigateNewPage(){
        String expectedPageTitle = "My Account – Alchemy LMS";
        WebElement element = driver.findElement(By.xpath("//li[contains(@id,'-1507')]"));
        element.click();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedPageTitle);
    }

}
