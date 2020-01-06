package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void NestedTextTest(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftText(), "LEFT", "incorrect text in Left Text");
        assertEquals(nestedFramesPage.getBottomText(), "BOTTOM", "incorrect text in Bottom Text");
    }
}
