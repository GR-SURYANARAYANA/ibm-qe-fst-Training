package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityFifteen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("What's the Title of the Page ? Its : "+ driver.getTitle());

        WebElement firstName = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
        firstName.sendKeys("Suryanarayana");

        WebElement emailAddress = driver.findElement(By.xpath("//input[contains(@id,'-email')]"));
        emailAddress.sendKeys("suryagr14@gmail.com");

        WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name , 'event-date')]"));
//        eventDate.sendKeys("2025-06-26");
        eventDate.sendKeys("2003-06-30");


        WebElement addDetails = driver.findElement(By.xpath("//form//textarea"));
        addDetails.sendKeys("Hi There Suryanarayana here..!!");

        WebElement submit = driver.findElement(By.xpath("//form//button"));
        submit.click();

        WebElement message =driver.findElement(By.xpath("//h3[starts-with(@id,'action-confirmation')]"));
        System.out.println("Is it Submitted : "+message.getText());
        driver.quit();
    }
}
