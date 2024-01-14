package tests.Test02;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookLocators;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookPage {

    Faker faker;
    @Test
    public void test2(){
        FacebookLocators facebookLocators = new FacebookLocators();
        Driver.getDriver().get(ConfigReader.getPropertie("facebookURL"));
        faker = new Faker();
        facebookLocators.email.sendKeys(faker.internet().emailAddress());
        facebookLocators.password.sendKeys(faker.internet().password());
        facebookLocators.log_in.click();
        Assert.assertTrue(facebookLocators.error_result.isDisplayed());

    }
}
