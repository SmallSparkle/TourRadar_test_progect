package tests.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TourCardSteps {
    SelenideElement fistTourCardSelector =
            $(".js-serp-tour-list")
            .$$(".tour")
            .first();

    @Step("Select 1st Tour card")
    public void select1stTourCard() {
        $(fistTourCardSelector).shouldBe(exist);
    }
//    TODO: These steps are written as an example.
//     In a real test, you can check previously known data
//     either created automatically before running the test or prepared in advance.

    @Step("Check that Tour card contents tour price")
    public void checkTourPrice() {
        String getTourPrice =
                $(fistTourCardSelector)
                        .$(".br__price-wrapper-price-description")
                        .$("[itemprop=price]")
                        .getAttribute("content");
        double tourPrice = Double.parseDouble(getTourPrice);
        assertTrue(tourPrice > 0);
    }

    @Step("Check that Tour card contents tour name")
    public void checkTourName() {
        $(fistTourCardSelector)
                .$("[itemprop=name]")
                .shouldHave(text("Europe Escape - 12 Days"));
    }

    @Step("Check that card contents View tour button")
    public void checkViewTourButton() {
        $(fistTourCardSelector)
                .$(byText("View tour")).shouldBe(visible);
    }

    @Step("Check that card contents Download Brochure button")
    public void checkDownloadBrochureButton() {
        $(fistTourCardSelector)
                .$(byText("Download Brochure"))
                .shouldBe(visible);
    }
}
