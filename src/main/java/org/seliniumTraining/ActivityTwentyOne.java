package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class ActivityTwentyOne {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tabs");
        String parentHandle = driver.getWindowHandle();
        System.out.println("The driver is at : "+ driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//button[text() = 'Open A New Tab']"));
        element.click();
        System.out.println("The driver after clicking is at : "+driver.getTitle());
        Set<String> handleList = driver.getWindowHandles();
        for (String handle : handleList) {
            if(!handle.equals(parentHandle))
                    driver.switchTo().window(handle);

        }
        System.out.println("After switch the driver is at : "+driver.getTitle());
        driver.close();
    }
}
