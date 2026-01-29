package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityFive {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Title of the page is : "+driver.getTitle());
        WebElement checkBox = driver.findElement(By.id("checkboxDiv"));
        System.out.println("Before clicking");
        isDisplayed(checkBox);
        checkBox.click();
        System.out.println("After clicking: ");
        isDisplayed(checkBox);
        WebElement toggleCheckBox = driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']"));
        toggleCheckBox.click();
        System.out.println("Check after toggle is clicked");
        isDisplayed(checkBox);
        WebElement textBox = driver.findElement(By.xpath("//input[@id = 'textInput']"));
        System.out.println("Text box checkouts..!!!!");
        isDisplayed(textBox);
        driver.close();
    }

    public static void isDisplayed(WebElement element){
        System.out.println("IS checkbox displayed?");
        if(element.isDisplayed()){
            System.out.println("Yes..!! CheckBox is Displayed");
            System.out.println("Is checkbox selected");
            if(element.isSelected()){
                System.out.println("Yes..!! Checkbox is selected");
            }else{
                System.out.println("No check Box is not selected");
            }
        }else{
            System.out.println("No checkbox is not Displayed");
        }
    }
}
