package defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.BuySteps;

public class BuyDef {
    @Steps
    BuySteps buySteps;

    @And("User click on add to cart button")
    public void UserClickOnAddToCart() throws Throwable{
        buySteps.User_Click_On_Add_To_Cart();
    }
    @Then("Message is displayed")
    public void MessageIsDisplayed() throws Throwable{
        buySteps.Message_Is_Displayed();
    }

    @And("User click on Cart")
    public void UserClickOnCart() throws Throwable{
        buySteps.User_Click_On_Cart();
    }

    @Then("Product is added to cart")
    public void ProductIsAddedToCart() throws Throwable{
        buySteps.Product_Is_Added_To_Cart();
    }

    @And("User click on Buy")
    public void UserClickOnBuy() throws Throwable{
        buySteps.User_CLick_On_Buy();
    }

    @Then("Payment page is displayed")
    public void PaymentPageIsDisplayed() throws Throwable{
        buySteps.Payment_Page_Is_Dispalyed();
    }
}
