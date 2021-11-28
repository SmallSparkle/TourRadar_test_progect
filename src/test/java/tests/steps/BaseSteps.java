package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    @Step("Open the /europe page")
    public void openEuropeURL() {
        open("/d/europe");
    }

    @Step("Check that opened page contents text Europe Tours & Trips")
    public void checkPageTitle() {
        $("h1").shouldHave(text("Europe Tours & Trips"));
    }
}
