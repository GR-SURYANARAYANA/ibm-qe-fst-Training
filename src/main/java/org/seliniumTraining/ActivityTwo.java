package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityTwo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println("The title of Current Page is :"+ driver.getTitle());
        WebElement userName = driver.findElement(By.id("username"));

        WebElement passwordElement = driver.findElement(By.id("password"));
        System.out.println(userName.getAttribute("placeholder"));
        System.out.println(passwordElement.getAttribute("placeholder"));
        userName.sendKeys("admin");
        passwordElement.sendKeys("password");

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();
        System.out.println("Click is done sucessfull");
        System.out.println("The new title of the page is : "+ driver.getTitle());
        System.out.println("The new url located is : "+ driver.getCurrentUrl());
    }
}
