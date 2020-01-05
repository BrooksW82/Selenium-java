package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextClick_Alert_Test(){
        var contextPage = homePage.clickContextMenu();
        contextPage.rightClickWindow();
        String text = contextPage.alert_GetText();
        contextPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "context menu text incorrect");
    }
}
