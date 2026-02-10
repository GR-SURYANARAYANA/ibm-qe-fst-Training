package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity8 extends BaseClass {
    @Test(groups = {"Activity8"}, dependsOnGroups = {"Activity1"})
    public void contactUS(){
        WebElement contactButton = driver.findElement(By.partialLinkText("Contact"));
        contactButton.click();
        WebElement fullName = driver.findElement(By.xpath("//input[contains(@name,'wpforms[fields][0]')]"));
        WebElement email = driver.findElement(By.xpath("//input[contains(@name,'wpforms[fields][1]')]"));
        WebElement subject = driver.findElement(By.xpath("//input[contains(@name,'wpforms[fields][3]')]"));
        WebElement comments = driver.findElement(By.xpath("//textarea"));
        WebElement submit = driver.findElement(By.xpath("//form//button"));
        fullName.sendKeys("SuryaNarayana");
        email.sendKeys("suryagr@gmail.com");
        subject.sendKeys("Welcome Homes..!");
        comments.sendKeys("Welcome Surya you finally done it..!!");
        submit.click();
        WebElement resultBox = driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us!')]"));
        Assert.assertTrue(resultBox.isDisplayed());
    }
}
