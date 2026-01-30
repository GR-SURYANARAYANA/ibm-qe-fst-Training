package org.seliniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.stream.Stream;

public class ActivityThirteen {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("The title of the page is : "+driver.getTitle());
        List<WebElement> tableHeader = driver.findElements(By.xpath("//table//tr//th"));
        System.out.println("Number of columns are : "+tableHeader.toArray().length);
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
        System.out.println("Number of rows are : "+rows.toArray().length);
        System.out.println("The third row is : "+rows.get(2).getText());
        System.out.println("The Second Row Second Column is of : "+rows.get(1).getText());
//        WebElement rowsSecond = driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]"));
//        System.out.println(rowsSecond.getText());

        System.out.println("The SecondRow ThirdColumn is : "+rows.get(2).findElement(By.xpath("td[3]")).getText());
    }
}
