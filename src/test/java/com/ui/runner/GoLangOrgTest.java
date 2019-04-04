package com.ui.runner;

import com.codeborne.selenide.Configuration;
import com.ui.pages.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoke", "json:target/cucumber.json"},
        features = "src/test/java/com/ui/features",
        glue = "com/ui/steps",
        tags = "@smoke")

public class GoLangOrgTest extends BasePage {
    @BeforeClass
    static public void setupTimeout() {
        Configuration.timeout = 7;
    }
}
