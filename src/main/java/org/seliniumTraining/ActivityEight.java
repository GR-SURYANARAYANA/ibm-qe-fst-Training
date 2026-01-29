package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActivityEight {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/mouse-events");
        WebElement cargoLockButton = driver.findElement(By.xpath("//h1[text() = 'Cargo.lock']"));
        WebElement cargoTomlButton = driver.findElement(By.xpath("//h1[text() = 'Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text() = 'src']"));
        WebElement target = driver.findElement(By.xpath("//h1[text() = 'target']"));
        WebElement resultText = driver.findElement(By.xpath("//p[@id = 'result']"));
        cargoLockButton.click();
        System.out.println(resultText.getText());

        Actions builder = new Actions(driver);
        Action actionPerform = builder.click(cargoLockButton).pause(500).moveToElement(cargoTomlButton).doubleClick(srcButton).contextClick(target).release().build();
        actionPerform.perform();

    }
}
