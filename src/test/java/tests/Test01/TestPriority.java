package tests.Test01;

import org.testng.annotations.Test;
import utilities.TestBeforeMethodAfterMethod;

public class TestPriority extends TestBeforeMethodAfterMethod {
    @Test(priority = 2)
    public void test_amazon(){
        driver.get("https://www.amazon.com.tr");
    }
    @Test(priority = -1)
    public void test_facebook(){
        driver.get("https://www.facebook.com");
    }
    @Test(priority = 20)
    public void test_wallmart(){
        driver.get("https://www.Wallmart.com");
    }
}
