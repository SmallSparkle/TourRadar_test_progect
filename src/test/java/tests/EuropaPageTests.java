package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.steps.*;

import static io.qameta.allure.Allure.step;

class EuropaPageTests extends TestBase {
    private final BaseSteps baseStep = new BaseSteps();
    private final TourListSteps tourListStep = new TourListSteps();
    private final TourCardSteps tourCardStep = new TourCardSteps();
    private final HeaderSteps headerStep = new HeaderSteps();
    private final LoginSteps loginStep = new LoginSteps();

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
        tourCardStep.select1stTourCard();
        tourCardStep.checkTourPrice();
        tourCardStep.checkTourName();
        tourCardStep.checkViewTourButton();
        tourCardStep.checkDownloadBrochureButton();
    }

    @Test
    @AllureId("5950")
    @DisplayName("Check the transition to the login page from the header")
    public void openLoginPageFromHeaderTest() {
        baseStep.openEuropeURL();
        headerStep.hoverProfileIcon();
        headerStep.clickLoginButton();
        loginStep.checkLoginPageIsOpened();
        loginStep.checkLoginForm();
    }

}
