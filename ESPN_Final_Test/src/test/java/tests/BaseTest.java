package tests;

import configuration.Driver;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.HomePage;
import reporting.Reporter;

import static java.lang.String.format;

public class BaseTest {
    private Driver driver;
    protected HomePage homePage;

    @Parameters({"browser", "url"})
    @BeforeTest()
    public void testSetup(String browser, String url){
        driver = new Driver(browser);
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homePage = new HomePage(driver.getDriver());
    }
    @AfterTest()
    public void closeBrowser(){ driver.getDriver().quit(); }
    public <T> void checking(
            String description, T actualValue, Matcher<? super T> expectedValue){
        Reporter.info(
                format("Checking... " + description.toLowerCase() + "[Expectation: %s]", expectedValue));
        try{
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError error){
            Reporter.error(format("Assertion error: [%s]", error.getMessage()
                    .replaceAll("\n", "")));
        }
    }
}
