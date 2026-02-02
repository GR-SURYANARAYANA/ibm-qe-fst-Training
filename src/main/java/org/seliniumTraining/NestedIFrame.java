package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.prefs.AbstractPreferences;

public class NestedIFrame {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/nested-iframes");
        System.out.println("Get the Title of the page : "+driver.getTitle());

        WebElement frame = driver.findElement(By.cssSelector("iframe[src$= 'nested-iframe1']"));

        System.out.println(frame.getText());
        WebElement frameOne = frame.findElement(By.id("//iframe[1]"));
        System.out.println(frameOne);



    }
}
