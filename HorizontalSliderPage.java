package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector("#content > div > div > input[type=range]");
    private By value = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSlider(double distance) {
        for (int i = 0; i < distance * 2; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValue(){
        return driver.findElement(value).getText();
    }
}

