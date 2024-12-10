package steps;

import net.serenitybdd.annotations.Step;
import pages.DetailPage;

public class DetailSteps {
    private DetailPage detailPage;

    @Step
    public void User_Click_On_Product() throws Throwable{
        detailPage.getInfor();
        detailPage.chooseProduct();
    }

    @Step
    public void Products_Detail_Is_Displayed() throws Throwable {
        detailPage.compareProductName();
        //detailPage.compareProductPrice();
    }

}