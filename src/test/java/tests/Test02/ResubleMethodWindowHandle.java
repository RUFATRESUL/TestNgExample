package tests.Test02;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResubleMethods;

public class ResubleMethodWindowHandle {
    @Test(groups = "grup1")
    public void test(){
        HerokuappPage herokuappPage = new HerokuappPage();
        Driver.getDriver().get(ConfigReader.getPropertie("herokuURL"));
        herokuappPage.click_submit.click();
        ResubleMethods.switchToWindow("New Window");
        String expected_data = "New Window";
        String actual_data = Driver.getDriver().getTitle();
        Assert.assertTrue(actual_data.contains(expected_data));

    }
}
