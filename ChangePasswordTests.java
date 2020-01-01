package changePassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;

import static org.testng.Assert.assertTrue;

public class ChangePasswordTests extends BaseTests {

    @Test
    public void TestChangePassword() {
        var ForgotPasswordPage = homePage.clickForgotPassword();
        ForgotPasswordPage.setEmail("TAU@example.com");
        EmailSentPage emailSentPage = ForgotPasswordPage.clickButton();
        assertTrue(emailSentPage.getContent().contains("Your e-mail's been sent!"),"Text alert incorrect");
    }
}
