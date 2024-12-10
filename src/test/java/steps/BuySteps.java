package steps;

import net.serenitybdd.annotations.Step;
import pages.CartPage;
import pages.DetailPage;
import pages.PaymentPage;

public class BuySteps {
    private DetailPage detailPage;
    private CartPage cartPage;
    private PaymentPage paymentPage;

    @Step
    public void User_Click_On_Add_To_Cart() throws Throwable{
        detailPage.addToCart();
    }

    @Step
    public void Message_Is_Displayed() throws Throwable{
        detailPage.messageAddToCartIsDisplayed();
    }

    @Step
    public void User_Click_On_Cart() throws Throwable{
        detailPage.goToCart();
    }

    @Step
    public void Product_Is_Added_To_Cart() throws Throwable{
        cartPage.ChosenOneIsDisplayedAtTheFirst();
    }

    @Step
    public void User_CLick_On_Buy() throws Throwable{
        cartPage.Buy();
    }

    @Step
    public void Payment_Page_Is_Dispalyed() throws Throwable{
        paymentPage.verifyTitle();
    }
}