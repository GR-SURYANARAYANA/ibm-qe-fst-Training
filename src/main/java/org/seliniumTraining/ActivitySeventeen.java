package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActivitySeventeen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        Select multiSelect = new Select(driver.findElement(By.xpath("//section//div[2]//select")));
        WebElement result = driver.findElement(By.xpath("//section//div[2]//p"));

        multiSelect.selectByVisibleText("HTML");
        System.out.println("After Selecting HTML : "+result.getText());

        multiSelect.selectByIndex(4);
        multiSelect.selectByIndex(5);
        multiSelect.selectByIndex(6);
        System.out.println("After selecting multi Index '4,5,6' : "+result.getText());
        multiSelect.selectByVisibleText("Node");
        System.out.println("After selecting multi Index 'Node' : "+result.getText());

        multiSelect.deselectByIndex(5);
        System.out.println("After selecting multi Index deselecting 5th : "+result.getText());

    }
}
