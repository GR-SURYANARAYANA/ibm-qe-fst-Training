package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ActivitySixteen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");

        List<WebElement> valueSelect = driver.findElements(By.xpath("//section//div[1]//select//option"));
        List<WebElement> visibleText = driver.findElements(By.xpath("//section//div[2]//select//option"));

        System.out.println("the second option using the visible text  : "+ visibleText.get(1).getText());
        System.out.println(" the third option using the index  :" + visibleText.get(2).getText());
        System.out.println(" the fourth option using the value  :" + valueSelect.get(3).getText());
        System.out.println("All printed Sucessfully");
        driver.close();


    }
}
