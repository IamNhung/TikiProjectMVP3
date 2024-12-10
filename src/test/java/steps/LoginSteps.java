package steps;

import net.serenitybdd.annotations.Step;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;

    @Step
    public void user_Access_Website() throws Throwable {
        loginPage.open();
    }

    @Step
    public void user_Close_Promotion() throws Throwable {
        loginPage.closePromotion();
    }

    @Step
    public void user_Clicks_Account_Link() throws Throwable {
        loginPage.clickAccountLink();
    }

    @Step
    public void user_Click_Login_Email() throws Throwable {
        loginPage.clickLoginByEmailLink();
    }

    @Step
    public void user_Enters_Username_And_Password(String username, String password) throws Throwable {
        loginPage.enterCredentials(username, password);
    }

    @Step
    public void user_click_Login_button() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Step
    public void solve_Captcha_Manually() throws Throwable {
        Thread.sleep(10000);
    }

    @Step
    public void User_login_Successfully() {
        loginPage.promotionIsDisplayed();
    }

    @Step
    public void error_Is_Displayed() {
        loginPage.errorIsDisplayed();
    }
}