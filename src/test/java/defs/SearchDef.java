package defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.SearchSteps;

public class SearchDef {
    @Steps
    SearchSteps searchSteps;

    @When("User searches for a {string}")
    public void UserSearchesForAKeyword(String keyword) throws Throwable{
        searchSteps.User_Searches_For_A_Keyword(keyword);
    }
    @Then("Results related to keyword are displayed")
    public void ResultsRelatedToKeywordDisplayed() throws Throwable{
        searchSteps.Results_related_to_keyword_displayed();
    }

}
