package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab(" New Window");
    }

    @Test
    public void testOpenNewTab(){
        var example2Page = homePage.clickDynamicLoading().openExample2InNewTab();
        getWindowManager().switchToTab();
        assertTrue(example2Page.isStartButtonDisplayed(), "start button not displayed");
    }

}
