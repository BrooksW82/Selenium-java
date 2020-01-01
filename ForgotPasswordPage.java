package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By Email = By.id("email");
    private By Submit = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String theEmail){
        driver.findElement(Email).sendKeys(theEmail);
    }

    public EmailSentPage clickButton(){
        driver.findElement(Submit).click();
        return new EmailSentPage(driver);
    }
}