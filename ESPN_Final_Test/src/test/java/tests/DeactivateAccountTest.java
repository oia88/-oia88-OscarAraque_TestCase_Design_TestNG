package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class DeactivateAccountTest extends BaseTest {
    @BeforeMethod
    public void login() {
        homePage.closeBanner();
        homePage.login();
    }
    @Test
    public void deactivateAccount() throws InterruptedException {

        homePage.clickOnUserIcon();
        homePage.clickOnEspnProfile();
        homePage.switchToIframeSection();
        Thread.sleep(10000);
        homePage.clickOnAccountDeleteLink();
        Thread.sleep(10000);
        homePage.clickOnDeleteAccountButton();
        homePage.refreshOnOkButton();
    }
    @AfterMethod
    public void loginAfterDeactivate() throws InterruptedException {
        homePage.login();
        checking("Account Deactivated",
                homePage.deactivateMessageIsDisplayed(),
                is(true));
    }
}
