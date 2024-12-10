package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class CartPage extends PageObject {
    String firstName, expectedName;

    @FindBy(xpath = "(//a[contains(@class, 'ItemNamestyles__StyledName')])[1]")
    WebElementFacade txtTheFirst;

    @FindBy(xpath = "//button[@class = 'styles__StyledButton-sc-rq5fjn-0 dGoOLh']")
    WebElementFacade btnPayment;

    public void ChosenOneIsDisplayedAtTheFirst() {
        firstName = txtTheFirst.waitUntilVisible().getText();
        expectedName = DetailPage.getName1();
        Assert.assertEquals("Name is not matching", expectedName, firstName);
    }

    public void Buy() {
        btnPayment.waitUntilVisible().click();
    }
}