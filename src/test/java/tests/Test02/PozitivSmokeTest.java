package tests.Test02;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitivSmokeTest {
    BrcPage brcPage = new BrcPage();
    @Test
    public void pozitiv_smoke_test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertie("brcURL"));
        brcPage.login_button.click();
        brcPage.email.sendKeys(ConfigReader.getPropertie("BrcEmail"));
        brcPage.password.sendKeys(ConfigReader.getPropertie("BrcPass"));
        Thread.sleep(2000);
        brcPage.log_in.click();
        Assert.assertTrue(brcPage.login_success.isDisplayed());
    }
}
