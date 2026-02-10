package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass{
    @Test(groups = {"Activity6"}, dependsOnGroups = {"Activity5"})
    public void Login(){
        driver.findElement(By.xpath("//a[text() = 'Login']")).click();
        WebElement loginInput = driver.findElement(By.xpath("//input[@id = 'user_login']"));
        WebElement pwdInput = driver.findElement(By.xpath("//input[@id = 'user_pass']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@name = 'wp-submit']"));
        loginInput.sendKeys("root");
        pwdInput.sendKeys("pa$$w0rd");
        loginButton.click();
        WebElement imgElement = driver.findElement(By.xpath("//img[contains(@class,'-96')]"));
        Assert.assertTrue(imgElement.isDisplayed());
    }
}
