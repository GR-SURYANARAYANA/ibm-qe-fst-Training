import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass {
    @Test(groups = "Activity3")
    public void checkFirstBoxInfo(){
        String actualText = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3")).getText();
        String expectText = "Actionable Training";
        Assert.assertEquals(actualText,expectText);

    }
}
