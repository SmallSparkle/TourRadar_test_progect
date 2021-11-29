package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.*;

public class TourListSteps {

    @Step("Check that Tour list is not empty")
    public void CheckTourListIsNotEmpty() {
        int countTourCardsInList = $(".js-serp-tour-list").$$(".tour").size();
        assertTrue( countTourCardsInList > 0);
    }
}
