package tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class LoginTest extends BaseTest {
    @Test
    public void login() throws InterruptedException {
        checking(
                "Element: 'ESPN logo' is present",
                homePage.espnLogoIsDisplayed(),
                is(true));
        homePage.clickOnPersonIcon();
        homePage.clickOnLoginLink();
        //Thread.sleep(3000);
        homePage.changeToIframeSection();
        checking(
                "Element: 'Modal' is present",
                homePage.modalIsDisplayed(),
                is(true));
        checking(
                "Element: 'Login button' is present",
                homePage.loginButtonIsDisplayed(),
                is(true));
        checking(
                "Element: 'Sign Up button' is present",
                homePage.signUpButtonIsDisplayed(),
                is(true));
        homePage.entryEmailOnInput("oscar.araque@globant.com");
        homePage.entryPasswordOnInput("@Millonarios");
        homePage.clickLoginButton();
    }
}
