package tests.Test02;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AloTechPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativSmokeTest {
    AloTechPage aloTechPage = new AloTechPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void wrong_username() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertie("aloTechURL"));
        aloTechPage.email.sendKeys(ConfigReader.getPropertie("WrongUser"));
        aloTechPage.password.sendKeys(ConfigReader.getPropertie("Password"));
        Thread.sleep(2000);
        actions.doubleClick(aloTechPage.log_in);
        Thread.sleep(2000);
        aloTechPage.log_in.click();
        Assert.assertTrue(aloTechPage.result.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void wrong_username_password() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertie("aloTechURL"));
        aloTechPage.email.sendKeys(ConfigReader.getPropertie("WrongUser"));
        aloTechPage.password.sendKeys(ConfigReader.getPropertie("WrongPass"));
        Thread.sleep(2000);
        actions.doubleClick(aloTechPage.log_in);
        Thread.sleep(2000);
        aloTechPage.log_in.click();
        Assert.assertTrue(aloTechPage.result.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void wrong_password() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertie("aloTechURL"));
        aloTechPage.email.sendKeys(ConfigReader.getPropertie("User"));
        aloTechPage.password.sendKeys(ConfigReader.getPropertie("WrongPass"));
        Thread.sleep(2000);
        actions.doubleClick(aloTechPage.log_in);
        Thread.sleep(2000);
        aloTechPage.log_in.click();
        Assert.assertTrue(aloTechPage.result.isDisplayed());
        Driver.closeDriver();

    }
}
