package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login_button;

    @FindBy(id = "formBasicEmail")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement log_in;

    @FindBy(id = "dropdown-basic-button")
    public WebElement login_success;
}
