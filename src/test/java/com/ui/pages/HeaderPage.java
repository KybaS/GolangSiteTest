package com.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderPage extends BasePage {
    private static final String BLOG_BUTTON = "//a[@href='/blog/']";

    @Step
    public void navigateToBlog() {
        $x(BLOG_BUTTON).click();
    }
}
