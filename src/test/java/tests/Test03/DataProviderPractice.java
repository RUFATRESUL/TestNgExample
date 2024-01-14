package tests.Test03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataProviderPractice {
    @DataProvider
    public static Object[][] registration() {
        return new Object[][]{{"user01@gmail.com","12345"},{"user02@gmail.com","67890"},{"user03@gmail.com","123abc"}};
    }

    @Test(dataProvider = "registration",groups = "grup1")
    public void test02(String email,String password){
        BrcPage brcPage = new BrcPage();
        Driver.getDriver().get(ConfigReader.getPropertie("brcURL"));
        brcPage.login_button.click();
        brcPage.email.sendKeys(email);
        brcPage.password.sendKeys(password);
        brcPage.log_in.click();
        Assert.assertTrue(brcPage.log_in.isDisplayed());


    }
}
