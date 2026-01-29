package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityFour {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Open a new browser
        driver.get("https://training-support.net/webelements/target-practice");
        //Get the title of the page and print it to the console.
        System.out.println(driver.getTitle());
        WebElement headingThree = driver.findElement(By.xpath("//h3[1]"));
        System.out.println(headingThree.getDomAttribute("class"));
        System.out.println("The Heading text of H3 is : "+headingThree.getText());
        System.out.println("The Heading text of H3 is : "+headingThree.getCssValue("color"));

        WebElement headingFour = driver.findElement(By.xpath("//h3[1]"));
        System.out.println("The Heading text of H3 is : "+headingFour.getText());
        /*
        Using any other locator:
        Find the purple button and print all it's classes.
        Find the slate button and print it's text.
     */
        WebElement purpleButton = driver.findElement(By.xpath("//button[text() = 'Purple']"));
        System.out.println(purpleButton.getDomAttribute("class"));
        WebElement slateButton = driver.findElement(By.xpath("//button[contains(@class, 'slate')]"));
        System.out.println("slate button text :" + slateButton.getText());



        driver.close();
    }
}
