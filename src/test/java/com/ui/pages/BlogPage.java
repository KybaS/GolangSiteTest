package com.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BlogPage extends BasePage {

    @Step
    public void findAndOpenUsingGoModulesArticle(String article) {
        $x("//*[contains(text(), '" + article + "')]").scrollTo();
        $x("//a[contains(text(), '" + article + "')]").click();
    }

    @Step
    public void checkImportantParagraph(String paragraph) {
        $x("//*[contains(text(), '" + paragraph + "')]").scrollTo();
        $("#content").shouldHave(Condition.text(paragraph));
    }
}
