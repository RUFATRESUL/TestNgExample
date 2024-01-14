package tests.Test02;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class SingeltonPattern {
    @Test
    public void test(){
        Driver drive = new Driver();
        drive.getDriver().get(ConfigReader.getPropertie("amazonURL"));

    }
}
