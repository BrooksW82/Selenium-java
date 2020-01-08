package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.*;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testSelectMultipleDropdown(){
        var dropdown = homePage.clickDropDown();
        dropdown.addMultipleOptions();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdown::selectFromDropDown);

        var selectedOptions = dropdown.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items incorrect");
    }
}
