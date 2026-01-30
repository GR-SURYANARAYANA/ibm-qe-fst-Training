package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityTwelve {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println("The title of the page is "+driver.getTitle());

        WebElement clickButton = driver.findElement(By.id("genButton"));
        WebElement wordElement = driver.findElement(By.xpath("//*[@id=\"word\"]"));
        clickButton.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
        if(wait.until(ExpectedConditions.textToBePresentInElement(wordElement,"release"))){
            System.out.println("Word found now it been closed" );
        }
        driver.quit();
    }
}
