package tests.Test01;

import org.testng.annotations.Test;
import utilities.TestBeforeClassAfterClass;

public class BeforeAfterClaass extends TestBeforeClassAfterClass {
    @Test
    public void test_amazon(){
        driver.get("https://www.amazon.com.tr");
    }
    @Test
    public void test_facebook(){
        driver.get("https://www.facebook.com");
    }
    @Test
    public void test_wallmart(){
        driver.get("https://www.wallmart.com");
    }
}
