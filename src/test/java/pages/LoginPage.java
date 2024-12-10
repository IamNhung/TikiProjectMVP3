package pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

@DefaultUrl("https://tiki.vn/")
public class LoginPage extends PageObject {
    private String keyword;

    @FindBy(xpath = "//img[@alt='close-icon']")
    WebElementFacade btnClosePromotion;
    @FindBy(xpath = "//*[@data-view-id=\"header_header_account_container\"]")
    WebElementFacade lnkAccount;
    @FindBy(className = "login-with-email")
    WebElementFacade lnkLoginByEmail;
    @FindBy(xpath = "//input[@type='email']")
    WebElementFacade txtEmail;
    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade txtPassword;
    @FindBy(xpath = "//button[text()='Đăng nhập']")
    WebElementFacade btnLogin;
    @FindBy(className = "error-mess")
    WebElementFacade errorMessage;
    @FindBy(xpath = "//input[@data-view-id='main_search_form_input']")
    WebElementFacade txtSearchBar;
    @FindBy(xpath = "//button[@data-view-id='main_search_form_button']")
    WebElementFacade btnSearch;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div[1]/div/a[2]/span")
    WebElementFacade searchResult;

    public void closePromotion() {
        btnClosePromotion.waitUntilClickable().click();
    }

    public void clickAccountLink() {
        lnkAccount.waitUntilClickable().click();
    }

    public void clickLoginByEmailLink() {
        lnkLoginByEmail.waitUntilClickable().click();
    }

    public void enterCredentials(String username, String password) {
        txtEmail.waitUntilVisible().sendKeys(username);
        txtPassword.waitUntilVisible().sendKeys(password);
    }

    public void clickLoginButton() {
        btnLogin.waitUntilClickable().click();
    }

    public void promotionIsDisplayed() {
        btnClosePromotion.waitUntilClickable().click();
    }

    public void errorIsDisplayed() {
        String actualMessage = errorMessage.waitUntilVisible().getText();
        Assert.assertEquals(actualMessage,"Thông tin đăng nhập không đúng");
    }


    public void search(String keyword) {
        this.keyword = keyword;
        txtSearchBar.waitUntilVisible().sendKeys(keyword);
        btnSearch.waitUntilClickable().click();
    }

    public void verifyResult() {
        String result = searchResult.waitUntilVisible().getText();
        if(!result.contains(keyword)){
            Assert.fail("Search result is not match keyword");
        }
    }
}
