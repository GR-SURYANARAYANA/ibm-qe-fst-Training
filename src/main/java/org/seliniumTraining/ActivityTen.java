package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActivityTen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        WebElement ball = driver.findElement(By.xpath("//img[@id = 'ball']"));
        WebElement dropZoneOne = driver.findElement(By.xpath("//div[@id = \"dropzone1\"]/span"));
        WebElement dropZoneTwo = driver.findElement(By.xpath("//div[@id = \"dropzone2\"]/span"));
        Actions builder = new Actions(driver);
        Action toPerform = builder
                            .dragAndDrop(ball,dropZoneOne)
                            .dragAndDrop(ball,dropZoneTwo)
                            .release().build();
        System.out.println("Status of zone One  : "+dropZoneOne.getText());
        System.out.println("Status of zone Two  : "+dropZoneTwo.getText());
        toPerform.perform();



    }

}
