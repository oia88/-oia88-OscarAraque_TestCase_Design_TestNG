package tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        checking(
                "Element: 'ESPN logo' is present",
                homePage.espnLogoIsDisplayed(),
                is(true));
        homePage.clickOnUserIcon();
        homePage.clickOnLoginLink();
        checking(
                "Element: 'Modal' is present",
                homePage.modalIsDisplayed(),
                is(true));
        homePage.switchToIframeSection();
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
