package tests.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;
import utilities.TestBeforeMethodAfterMethod;

public class HardAssert extends TestBaseCross {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        Assert.assertTrue(searchbox.isEnabled());
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(result.isDisplayed());
        Assert.assertTrue(result.getText().contains("Java"));


    }
}
