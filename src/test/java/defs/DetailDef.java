package defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.DetailSteps;

public class DetailDef {
    @Steps
    DetailSteps detailSteps;

    @And("User click on product")
    public void UserClickOnProduct() throws Throwable{
        detailSteps.User_Click_On_Product();
    }

    @Then("Product's detail is displayed")
    public void ProductsDetailIsDisplayed() throws Throwable{
        detailSteps.Products_Detail_Is_Displayed();
    }
}
