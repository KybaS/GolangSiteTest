package com.ui.runner;

import com.codeborne.selenide.Configuration;
import com.ui.pages.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoke", "json:target/cucumber.json"},
        features = "src/test/java/com/ui/features",
        glue = "com/ui/steps",
        tags = "@smoke")

public class GoLangOrgTest extends BasePage {

    @BeforeClass  //settings for launch tests using selemoid (docker)
    static public void setup() {
        Configuration.remote = "http://192.168.99.100:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x1024";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeClass
    static public void setupTimeout() {
        Configuration.timeout = 7;
    }
}
