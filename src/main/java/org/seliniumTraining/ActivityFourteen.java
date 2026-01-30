package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ActivityFourteen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("The Title of the Activity 14 is : "+ driver.getTitle());
        List<WebElement> headers = driver.findElements(By.xpath("//thead/tr//th"));
        List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
        System.out.println(rows.get(4).getText());
        headers.get(4).click();
        System.out.println("After clicking the 5th row book name is ");
        System.out.println("BOOK NAME : "+driver.findElement(By.xpath("//tbody//tr[5]//td[2]")).getText());
        driver.close();
    }
}
