package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBeforeClassAfterClass {
    protected WebDriver driver;
    protected String date;
    @BeforeClass
    public void before_class(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYMMDDHHmmss");
        date = localDateTime.format(dateTimeFormatter);
    }
    @AfterClass
    public void after_class(){
//        driver.quit();
    }
}
