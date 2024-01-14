package tests.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBeforeClassAfterClass;

public class TestDependsOnMethods extends TestBeforeClassAfterClass {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
    }
    @Test(dependsOnMethods = "test01")
    public void test02(){
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

    }
    @Test(dependsOnMethods = "test02")
    public void test03(){

        WebElement result = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(result.getText().contains("Java"));
    }
}
