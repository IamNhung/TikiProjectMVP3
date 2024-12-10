package steps;

import net.serenitybdd.annotations.Step;
import pages.LoginPage;

public class SearchSteps {
    private LoginPage loginPage;

    @Step
    public void User_Searches_For_A_Keyword(String keyword) throws Throwable{
        loginPage.search(keyword);
    }

    @Step
    public void Results_related_to_keyword_displayed() throws Throwable {
        loginPage.verifyResult();
    }
}