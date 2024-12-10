package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;


public class DetailPage extends PageObject {
    private static String name1, price1,name2, price2, msg;

    @FindBy(xpath = "(//h3[contains(@class, 'NameStyled')])[9]")
    WebElementFacade txtProductName;
    @FindBy(xpath = "//h1[contains(@class, 'TitledStyled')]")
    WebElementFacade txtProductNameInDetail;
    @FindBy(xpath = "//div[@class= 'product-price__current-price']")
    WebElementFacade txtProductPriceInDetail;
    @FindBy(xpath = "//button[@data-view-id='pdp_add_to_cart_button']")
    WebElementFacade btnAddToCart;
    @FindBy(xpath = "//div[contains(@class,'CartNotification')]//p[@class='status']")
    WebElementFacade txtMessageOfAddToCart;
    @FindBy(xpath = "//a[@class= 'btn-view-cart']")
    WebElementFacade btnViewCart;

    public void getInfor () {
        name1 = txtProductName.getText();
    }

    public static String getName1() {
        return name1;
    }

    public void chooseProduct() {
        txtProductName.waitUntilClickable().click();
    }

    public void compareProductName() {
        name2 = txtProductNameInDetail.waitUntilEnabled().getText();
        Assert.assertEquals("Name of chosen product is not match name of detail product",name1,name2);
    }

    public void addToCart(){
        btnAddToCart.waitUntilClickable().click();
    }

    public void messageAddToCartIsDisplayed(){
        msg = txtMessageOfAddToCart.waitUntilEnabled().getText();
        Assert.assertEquals("Thêm vào giỏ hàng thành công!",msg);

    }

    public void goToCart(){
        btnViewCart.waitUntilClickable().click();
    }
}
