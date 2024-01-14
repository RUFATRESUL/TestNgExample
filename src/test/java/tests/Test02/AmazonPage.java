package tests.Test02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonLocators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class AmazonPage extends TestBaseCross {
    @Test
    public void test() throws InterruptedException {
        AmazonLocators amazonLocators = new AmazonLocators();
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));
        Thread.sleep(2000);
        amazonLocators.cookie.click();
        amazonLocators.searchbox.sendKeys("Selenium", Keys.ENTER);
        String expected_data = "Selenium";
        String actual_data = amazonLocators.WE.getText();
        Assert.assertTrue(actual_data.contains(expected_data));

    }
}
