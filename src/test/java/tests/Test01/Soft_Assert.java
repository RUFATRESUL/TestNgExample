package tests.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;
import utilities.TestBeforeMethodAfterMethod;

public class Soft_Assert extends TestBaseCross {
    @Test
    public void test02() throws InterruptedException {
        //SoftAssert methodu ile apardigimiz test prossesinde
        // bas vere bilecek xetalari qabaqcadan ozumuz teyin edib
        // qeyd edirik ve her hansi yalnisliq olduqda qeyd etdiyimiz
        // xetani bize qaytarir
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"daxil etdiyiniz ifade yoxdur");
        WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(searchbox.isEnabled(),"bele bir Webelement yoxdur");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(result.isDisplayed(),"axtaris edile bilinmedi");
        softAssert.assertTrue(result.getText().contains("Java"),"result daxilinde Iphone ifadesi yoxdur");
        //softAssert.assertAll() bu method mutleq qeyd edilmelidir yoxsa test prossesimiz calismayacaq.
        softAssert.assertAll();
        System.out.println("Eger sistemde xeta varsa bu ifade gorsenmeyecek");


    }
}
