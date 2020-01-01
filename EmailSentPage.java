package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    WebDriver driver;

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getContent(){
        return driver.findElement(By.id("content")).getText();
    }
}
