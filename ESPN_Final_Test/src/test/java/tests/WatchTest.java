package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WatchPage;

import static org.hamcrest.Matchers.is;

public class WatchTest extends BaseTest{
    @BeforeMethod
    public void login() {
        homePage.login();
    }

    @Test
    public void watch() throws InterruptedException {
        watchPage = homePage.clickLinkWatch();
        checking("Element: 'Carousel' is present",
                 watchPage.carouselIsDisplayed(),
                 is(true));
        checking("Element: 'Carousel Title' is present",
                watchPage.carouselTitleIsDisplayed(),
                is(true));
        checking("Element: 'Carousel Description' is present",
                watchPage.carouselDescriptionIsDisplayed(),
                is(true));
        watchPage.clickSecondCarousel();
        Thread.sleep(10000);
        checking("Element: 'Close 'X' Button' is present",
                watchPage.closeButtonIsDisplayed(),
                is(true));
        watchPage.clickCloseButton();
        homePage = watchPage.goBackPage();
        Thread.sleep(10000);
        homePage.hoverUserIcon();
        checking("Element: 'Nav Text: 'Welcome {{username}}!' ' is present",
                homePage.navTextIsDisplayed(),
                is(true));
        homePage.clickLogoutLink();
        checking("Element: 'Nav Text: 'Welcome' ' is present",
                homePage.navTextIsDisplayed(),
                is(true));
    }
}
