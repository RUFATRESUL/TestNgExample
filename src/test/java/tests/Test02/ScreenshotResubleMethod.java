package tests.Test02;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonLocators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResubleMethods;

import java.io.IOException;

public class ScreenshotResubleMethod {
    @Test
    public void test() throws IOException {
        AmazonLocators amazonLocators = new AmazonLocators();
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));
//        ResubleMethods.getScreenshot("fullScreenShot");
        ResubleMethods.sleep(1);
        amazonLocators.cookie.click();
        amazonLocators.searchbox.sendKeys("Iphone", Keys.ENTER);
        ResubleMethods.getScreenshotWebelement("webelementin ekan goruntusu",amazonLocators.WE);
        Driver.closeDriver();

    }
}
