package Activities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 extends BaseClass {
    @Test(groups = {"Activity1"})
    public void checkTitle(){
        System.out.println("Working on title");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Alchemy LMS – An LMS Application";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
