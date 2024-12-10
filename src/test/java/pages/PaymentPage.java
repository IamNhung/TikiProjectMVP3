package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends PageObject {
    String titlePayment;

    @FindBy(xpath = "//span[contains(text(),'Thanh toán')]")
    WebElementFacade txtPayment;


    public void verifyTitle() {
        titlePayment = txtPayment.waitUntilVisible().getText();
        Assert.assertEquals("Payment page is displayed", "Thanh toán", titlePayment);
    }


}