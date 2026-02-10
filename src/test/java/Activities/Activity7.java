package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 extends BaseClass{

    WebElement allCourse;

    @Test(groups = {"Activity7"}, dependsOnGroups = {"Activity1"})
    public void isCourseAvailable(){
        List<WebElement> menuElements = driver.findElements(By.xpath("//li[contains(@id,'menu-item-')]/a"));
        String text = "";
        for(WebElement e : menuElements){
            if(e.getText().equals("All Courses")){
                text =e.getText();
                e.click();
                allCourse = e;
                break;
            }
        }
        Assert.assertEquals(text, "All Courses");
    }

    @Test(groups = {"Activity7"}, dependsOnMethods = {"isCourseAvailable"})
    public void getCourses(){
        List<WebElement> Allcourses = driver.findElements(By.xpath("//div[contains(@class,'course-list-items')]/div"));
        Assert.assertEquals(Allcourses.toArray().length,3 );
    }

}
