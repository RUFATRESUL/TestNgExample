package tests.Test03;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonLocators;
import utilities.ConfigReader;
import utilities.Driver;

public class DataProviderTest {
    @DataProvider
    public static Object[][] axtarilacaqSozler() {
        return new Object[][]{{"java"},{"selenium"},{"Iphone"},{"Samsung"}};
    }

    @Test(dataProvider = "axtarilacaqSozler")
    public void test01(String words){
        AmazonLocators amazonLocators = new AmazonLocators();
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));
//        ResubleMethods.sleep(2);
//        amazonLocators.cookie.click();
        amazonLocators.searchbox.sendKeys(words, Keys.ENTER);
        String actual_data = amazonLocators.WE.getText();
        Assert.assertTrue(actual_data.contains(words));
    }
}
