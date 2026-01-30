package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActivityNine {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println("The title of the Page is "+driver.getTitle());
//        WebElement textElement = driver.findElement(By.xpath("//span[text() = '|']"));
//        WebElement textElement = driver.findElement(By.xpath("//span[text()='|']//.."));
//        textElement.sendKeys("hello");Keys("Hi Suryanarayana..!! How are you Today? Welcome to this page ").sendKeys(Keys.RETURN).build().perform();
//        textElement.sendKeys("Hello..!! Suryanarayana ");
////        Action toPerform = builder.sendKeys(textElement,"Hi Suryanarayana..!! How are you Today? Welcome to this page ").release().build();
//        Action toPerform = builder.sendKeys(textElement,"Hi Suryanarayana..!! How are you Today? Welcome to this page ").sendKeys(Keys.RETURN).build();

//        toPerform.perform();
    }
}
