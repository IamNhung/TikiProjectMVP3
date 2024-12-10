package defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;

public class LoginDef {

    @Steps
    LoginSteps loginStep;

    @Given("User access website")
    public void userAccessWebsite() throws Throwable {
        loginStep.user_Access_Website();
    }
    @And("User close promotion")
    public void userClosePromotion() throws  Throwable{
        loginStep.user_Close_Promotion();
    }

    @And("User click on Account link")
    public void userClicksAccountLink() throws Throwable {
        loginStep.user_Clicks_Account_Link();
    }

    @And("User click on Login by email")
    public void userClickLoginEmail() throws Throwable {
        loginStep.user_Click_Login_Email();
    }

    @When("User enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) throws Throwable {
        loginStep.user_Enters_Username_And_Password(username,password);
    }

    @And("User click on Login button")
    public void user_click_Login_button() throws Throwable {
        loginStep.user_click_Login_button();
    }

    @And("User solves CAPTCHA manually")
    public void solveCaptchaManually() throws Throwable {
        loginStep.solve_Captcha_Manually();
    }

    @Then("User login successfully")
    public void User_login_Successfully(){
        loginStep.User_login_Successfully();
    }

    @Then("Error message is displayed as expected")
    public void errorIsDisplayed() {
        loginStep.error_Is_Displayed();
    }
}
