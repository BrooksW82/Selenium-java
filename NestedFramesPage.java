package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.cssSelector("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftText(){
        switchToTopFrame();
        switchToLeftFrame();
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    public String getBottomText(){
        switchToBottomFrame();
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        return text;
    }

    private void switchToTopFrame(){
        driver.switchTo().frame(topFrame);
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }


    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
}
