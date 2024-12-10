package steps;

import net.serenitybdd.annotations.Step;
import pages.LoginPage;

public class CommonSteps {
    private LoginPage loginPage;

    @Step
    public void user_Is_On_Homepage(String username, String password) throws Throwable{
        loginPage.open();
        loginPage.closePromotion();
        loginPage.clickAccountLink();
        loginPage.clickLoginByEmailLink();
        loginPage.enterCredentials("nhungvu214@gmail.com", "Abc@12345");
        loginPage.clickLoginButton();
        Thread.sleep(10000);
        loginPage.promotionIsDisplayed();
    }
}