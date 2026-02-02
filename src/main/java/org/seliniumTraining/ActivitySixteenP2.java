package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Stream;

public class ActivitySixteenP2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        WebElement dropdown = driver.findElement(By.xpath("//section//div[1]//select"));
        WebElement result = driver.findElement(By.xpath("//section//div[1]//p"));
        Select singleSelect = new Select(dropdown);
        //Second option to Select using index
        singleSelect.selectByIndex(1);
        System.out.println(result.getText());
        //thrd option using value
        singleSelect.selectByValue("three");
        System.out.println(result.getText());

        //fourth by using visible text
        singleSelect.selectByVisibleText("Four");
        System.out.println(result.getText());
        //Get all option
        System.out.println("List of all options are: ");
        List<WebElement> options = singleSelect.getOptions();
        for(WebElement option:options){
            System.out.println("Option : "+ option.getText());
        }
    }
}
