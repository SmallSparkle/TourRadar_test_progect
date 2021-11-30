package tests.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TourListSteps {
    ElementsCollection cardsInTourList =
            $(".js-serp-tour-list")
            .$("ul")
            .$$(".tour");

    @Step("Check that Tour list is not empty")
    public void CheckTourListIsNotEmpty() {
        $$(cardsInTourList)
                .shouldBe(CollectionCondition.sizeNotEqual(0));
    }

    @Step("Check that Tour list is sorted by Travel Style is Private")
    public void checkTourListIsSorted() {
        $$(cardsInTourList)
                .first()
                .shouldHave(text("Private"));
    }
}
