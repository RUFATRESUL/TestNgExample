package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected String date;
    @BeforeMethod
    public void before_method(){
        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYMMDDHHmmss");
        date=localDateTime.format(dateTimeFormatter);
    }
    @AfterMethod
    public void after_method(){
//        driver.quit();
    }
}
