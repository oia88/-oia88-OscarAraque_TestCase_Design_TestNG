package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;
    @FindBy(css = "li.user ul.account-management li:nth-child(7)")
    private WebElement loginLink;
    @FindBy(linkText = "ESPN")
    private WebElement espnLogo;
    @FindBy(css = "#oneid-iframe")
    private WebElement modal;
    @FindBy(id = "InputLoginValue")
    private WebElement emailInput;
    @FindBy(id = "InputPassword")
    private WebElement passwordInput;
    @FindBy(id = "BtnSubmit")
    private WebElement loginButton;
    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;
    @FindBy(css = ".pillar.watch > a")
    private WebElement watchLink;
    @FindBy(className = "display-user")
    private WebElement navText;
    @FindBy(css = "li.user ul.account-management li:nth-child(8)")
    private WebElement logoutLink;
    @FindBy(css = ".account-management li:nth-child(5) > a")
    private WebElement espnProfile;
    @FindBy(css = "#AccountDeleteLink")
    private WebElement accountDeleteLink;
    @FindBy(css = "[data-testid='BtnSubmit']")
    private WebElement deleteButton;
    @FindBy(css = "[data-testid='BtnSubmit']")
    private WebElement okButton;
    @FindBy(css = "[data-testid='TextBlock']")
    private WebElement deactivateMessage;
    @FindBy(css = ".promo-banner-container iframe")
    private WebElement banner;
    @FindBy(css = "div.PromoBanner__CloseBtn")
    private WebElement bannerCloseButton;

    public void clickOnUserIcon(){
        clickElement(userIcon);
    }
    public void clickOnLoginLink(){
        clickElement(loginLink);
    }
    public void entryEmailOnInput(String text){
        typeOnInput(emailInput, text);
    }
    public void entryPasswordOnInput(String text){
        typeOnInput(passwordInput, text);
    }
    public void clickLoginButton(){
        clickElement(loginButton);
    }
    public boolean modalIsDisplayed(){ return modal.isDisplayed(); }
    public boolean espnLogoIsDisplayed(){
        return espnLogo.isDisplayed();
    }
    public boolean loginButtonIsDisplayed(){
        return loginButton.isDisplayed();
    }
    public boolean signUpButtonIsDisplayed(){
        return signUpButton.isDisplayed();
    }
    public void switchToIframeSection(){
        this.switchToIframe(modal);
    }
    public WatchPage clickLinkWatch(){
        clickElement(watchLink);
        return new WatchPage(getDriver());
    }
    public void hoverUserIcon(){
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
    }
    public boolean navTextIsDisplayed(){ return navText.isDisplayed(); }
    public void clickLogoutLink(){ clickElement(logoutLink); }
    public void login(){
        clickOnUserIcon();
        clickOnLoginLink();
        switchToIframeSection();
        entryEmailOnInput("taeproof6@gmail.com");
        entryPasswordOnInput("@Testing2022");
        clickLoginButton();
    }
    public void logout(){
        clickOnUserIcon();
        clickLogoutLink();
    }
    public void clickOnEspnProfile(){ clickElement(espnProfile); }
    public void clickOnAccountDeleteLink(){ clickElement(accountDeleteLink); }
    public void clickOnDeleteAccountButton(){ clickElement(deleteButton); }
    public void refreshOnOkButton(){
        getDriver().navigate().refresh();
    }
    public boolean deactivateMessageIsDisplayed(){ return deactivateMessage.isDisplayed(); }
    public boolean verifyBanner(){
        boolean isBanner = true;
        try{
            waitForVisibility(banner);
        } catch (TimeoutException e){
            isBanner = false;
        }
        return isBanner;
    }
    public void closeBanner(){
        if(this.verifyBanner()){
            switchToIframe(banner);
            clickElement(bannerCloseButton);
        }
    }
}
