package com.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    @Step
    protected void openSite(String url) {
        open(url);
    }
}
