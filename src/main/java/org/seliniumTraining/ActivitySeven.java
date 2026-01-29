package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivitySeven {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("The title of the Page is : "+driver.getTitle());
        WebElement inputTextBox = driver.findElement(By.xpath("//input[@id = 'textInput']"));
        System.out.println("Start of the page is it enabled");
        System.out.println(isAbletoWrite(inputTextBox));

        System.out.println("Start the click Button..!!");
        WebElement  inputTextButton = driver.findElement(By.xpath("//button[@id = 'textInputButton']"));
        System.out.println(inputTextButton.getDomAttribute("class"));
        inputTextButton.click();

        System.out.println("After clicking the button: ");
        System.out.println(isAbletoWrite(inputTextBox));

        inputTextBox.sendKeys("Hello...!! G R Suryanarayana ");

        inputTextButton.click();
        System.out.println("Sucessfully done..!! ");

        driver.close();

    }

    private static String isAbletoWrite(WebElement element) {
        if(element.isEnabled()){
            return "Yes..!! It's enabled";
        }else{
            return "No Its disabled";
        }
    }


}
