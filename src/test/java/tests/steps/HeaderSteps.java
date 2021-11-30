package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderSteps {

    @Step("Hover over profile icon")
    public void hoverProfileIcon() {
        $(".ao-header-navigation__profile-placeholder").hover();
    }

    @Step("Click on Log In button")
    public void clickLoginButton() {
        $(byText("Log In")).click();
    }
}
