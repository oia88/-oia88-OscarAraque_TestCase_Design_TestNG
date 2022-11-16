package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class LogoutTest extends BaseTest{
    @BeforeMethod
    public void login() {
        homePage.login();
    }
    @Test
    public void logout(){
        homePage.logout();
        checking("session is currently log out",
                homePage.navTextIsDisplayed(),
                is(true));
    }

}
