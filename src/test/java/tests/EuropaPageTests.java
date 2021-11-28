package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.steps.BaseSteps;
import tests.steps.TourListSteps;

import static io.qameta.allure.Allure.step;

class EuropaPageTests extends TestBase {
    private final BaseSteps baseStep = new BaseSteps();
    private final TourListSteps tourListStep = new TourListSteps();

    @Test
    @AllureId("5949")
    @DisplayName("Check /europe page can be opened")
    @Tags({@Tag("critical"), @Tag("web")})
    @Owner("a.bespalova")
    public void openEuropPageTest() {
        baseStep.openEuropeURL();
        baseStep.checkPageTitle();
        tourListStep.CheckTourListIsNotEmpty();
    }

    @Test
    @AllureId("5960")
    @DisplayName("Check Tour card contents all important attributes")
    public void tourCardTest() {
        baseStep.openEuropeURL();
        step("Select 1st Tour card");
        step("Check that card contents tour price");
        step("Check that card contents tour name");
        step("Check that card contents View tour & Download Brochure  buttons");
    }

}
