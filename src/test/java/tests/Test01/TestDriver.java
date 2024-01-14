package tests.Test01;

import org.testng.annotations.Test;
import utilities.Driver;

public class TestDriver {
    @Test
    public void  test(){
        Driver.getDriver().get("https://www.amazon.com.tr");
        Driver.getDriver().get("https://www.walmart.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
