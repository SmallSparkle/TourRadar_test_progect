package tests.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginSteps {

    @Step("Chek that /login page is opened")
    public void checkLoginPageIsOpened() {
        $(".form-title").shouldHave(text("Log in"));
    }

    @Step("Check that /login page has a login form")
    public void checkLoginForm() {
        $("#g_email")
                .shouldBe(visible);
        $("#g_password")
                .shouldBe(visible);
        $("#g_send")
                .shouldBe(visible)
                .shouldHave(text("Log in"));
    }
}
