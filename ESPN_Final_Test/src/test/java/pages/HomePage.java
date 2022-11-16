package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "global-user-trigger")
    private WebElement personIcon;
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
    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;
    @FindBy(className = "display-user")
    private WebElement navText;
    @FindBy(css = "li.user ul.account-management li:nth-child(8)")
    private WebElement logoutLink;


    public void clickOnPersonIcon(){
        clickElement(personIcon);
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
    public void changeToIframeSection(){
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
        clickOnPersonIcon();
        clickOnLoginLink();
        changeToIframeSection();
        entryEmailOnInput("oscar.araque@globant.com");
        entryPasswordOnInput("@Millonarios");
        clickLoginButton();
    }
    public void logout(){
        hoverUserIcon();
        clickLogoutLink();
    }
}
