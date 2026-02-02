package testng.Theory;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
    @Test(priority = 0)
    public void One() {
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 1, enabled = false)
    public void Two() {
        System.out.println("This is the Test Case number Two");
    }

    @Test
    public void aSkipTest() throws SkipException {
        String condition = "Skip Test";

        if (condition.equals("Skip Test")) {
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            //Execute test case when conditions are satisfied
        }

    }
}
