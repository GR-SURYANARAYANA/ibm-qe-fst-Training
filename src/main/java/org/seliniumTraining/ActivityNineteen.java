package org.seliniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityNineteen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        WebElement confirmation = driver.findElement(By.id("confirmation"));
        confirmation.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
//        alert.accept();
        alert.dismiss();
        driver.close();

    }
}
