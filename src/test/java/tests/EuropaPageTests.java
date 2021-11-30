package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.steps.*;

class EuropaPageTests extends TestBase {
    private final BaseSteps baseStep = new BaseSteps();
    private final TourListSteps tourListStep = new TourListSteps();
    private final TourCardSteps tourCardStep = new TourCardSteps();
    private final HeaderSteps headerStep = new HeaderSteps();
    private final LoginSteps loginStep = new LoginSteps();
    private final FilterSteps filterStep = new FilterSteps();

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
    @Tag("web")
    @AllureId("5960")
    @DisplayName("Check Tour card contents all important attributes")
    public void tourCardTest() {
        baseStep.openEuropeURL();
        tourCardStep.select1stTourCard();
        tourCardStep.checkTourPrice();
        tourCardStep.checkTourName();
        tourCardStep.checkViewTourButton();
        tourCardStep.checkDownloadBrochureButton();
    }

    @Test
    @Tag("web")
    @AllureId("5950")
    @DisplayName("Check the transition to the login page from the header")
    public void openLoginPageFromHeaderTest() {
        baseStep.openEuropeURL();
        headerStep.hoverProfileIcon();
        headerStep.clickLoginButton();
        loginStep.checkLoginPageIsOpened();
        loginStep.checkLoginForm();
    }

    @Test
    @AllureId("5952")
    @DisplayName("Check tour filtering by Adventure Type")
    @Tag("web")
    @Owner("c4-SmallSparkle")
    public void filteringByAdventureTypeTest() {
        baseStep.openEuropeURL();
        filterStep.selectAdventureTypePrivat();
        filterStep.setCountPerson();
        tourListStep.checkTourListIsSorted();
    }
}
