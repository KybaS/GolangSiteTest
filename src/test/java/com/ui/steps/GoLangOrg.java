package com.ui.steps;

import com.ui.pages.BlogPage;
import com.ui.pages.HeaderPage;
import com.ui.pages.HomePage;
import cucumber.api.java8.En;

public class GoLangOrg extends HomePage implements En {
    private HeaderPage headerPage = new HeaderPage();
    private BlogPage blogPage = new BlogPage();

    public GoLangOrg() {
        Given("^open home page$", () -> {
            openSite("https://golang.org");
        });

        And("^navigate to the Blog$", () -> {
            headerPage.navigateToBlog();
        });

        When("^find by visible text the 'Using Go Modules' article and open it$", () -> {
            blogPage.findAndOpenUsingGoModulesArticle("Using Go Modules");
        });

        When("^find by visible text the \"([^\"]*)\" article and open it$", (String article) -> {
            blogPage.findAndOpenUsingGoModulesArticle(article);
        });

        Then("^check important paragraph \"([^\"]*)\"$", (String paragraph) -> {
            blogPage.checkImportantParagraph(paragraph);
        });
    }
}
