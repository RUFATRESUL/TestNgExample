package tests.Test03;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRaport;

public class TestRaport extends TestBaseRaport {
    @Test
    public void test(){
        BrcPage brcPage = new BrcPage();
        extentTest=extentReports.createTest("LoginTest","Giris sehifesinin test edilmesi");
        Driver.getDriver().get(ConfigReader.getPropertie("brcURL"));
        extentTest.info("Blue rentA car websaytina daxil oldu");
        brcPage.login_button.click();
        extentTest.info(" Login button click etmekle login sehifesine daxil olduq");
        brcPage.email.sendKeys(ConfigReader.getPropertie("BrcEmail"));
        extentTest.info("Email daxil edildi");
        brcPage.password.sendKeys(ConfigReader.getPropertie("BrcPass"));
        extentTest.info("Password daxil edildi");
        brcPage.log_in.click();
        extentTest.info("melumatlari daxil etdikden sonra login buttonunu basiriq");
        Assert.assertTrue(brcPage.login_success.isDisplayed());
        extentTest.info("dogru melumatlar daxil etdiyimiz test edilir dogru olarsa True qaytarir");
        extentTest.pass("Sehifeye ugurlu sekilde daxil olundu");



    }
}
