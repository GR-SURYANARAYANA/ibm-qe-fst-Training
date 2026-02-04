package BDD.Activity2.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends BaseClass {
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver.get("https://training-support.net/webelements/login-form");
        assertEquals("Selenium: Login Form",driver.getTitle());
        System.out.println("Title check Done..!! "+driver.getTitle());

    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
        WebElement userInput = driver.findElement(By.xpath("//form//input[1]"));
        userInput.sendKeys(userName);
        WebElement passInput = driver.findElement(By.xpath("//form//input[2]"));
        passInput.sendKeys(password);

    }
    @And("clicks the submit button")
    public void clicksTheSubmitButton() {
        driver.findElement(By.xpath("//form//button")).click();
    }


    @Then("get the confirmation message and verify it as {string}")
    public void getTheConfirmationMessageAndVerifyItAs(String expectedMessage) {
        String message = "NOT FOUND";
        if (expectedMessage.contains("Invalid")) {
            message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2#subheading"))).getText();
        } else {
            message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
        }
        // Assert message
        Assertions.assertEquals(expectedMessage, message);

    }
}
