package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FilterSteps {

    @Step("Select Adventure Type Private")
    public void selectAdventureTypePrivat() {
        $(byText("Adventure Type")).scrollTo();
        $("label[for=checkbox-group-type-368]")
                .click();
    }

    @Step("Set 1 person will be travelling privately")
    public void setCountPerson() {
        $(".ao-serp-filters-min-private-pax").$(".js-am-quantity__button-plus").click();
    }
}
