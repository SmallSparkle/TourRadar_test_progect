package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class TourListSteps {

    @Step("Check that Tour list is not empty")
    public void CheckTourListIsNotEmpty() {
        $$("div.js-serp-tour-list.list > ul").shouldBe();
        //Assert.assertTrue(array_size > 0);
    }
}
