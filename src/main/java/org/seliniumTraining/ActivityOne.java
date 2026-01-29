package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityOne {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net");
        System.out.println("The title of the Page is : "+ driver.getTitle());

        WebElement element = driver.findElement(By.partialLinkText("About"));
        element.click();
        System.out.println("Element is clicked Sucessfully ");

        System.out.println("The Title of new Page is : " + driver.getTitle());

        driver.close();


    }
}
