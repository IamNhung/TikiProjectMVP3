package defs;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import steps.CommonSteps;

public class CommonDef {
    @Steps
    CommonSteps commonSteps;

    @Given("User is on the homepage")
    public void UserIsOnThehomepage() throws Throwable {
        commonSteps.user_Is_On_Homepage("nhungvu214@gmail.com", "Abc@12345");
    }

}
