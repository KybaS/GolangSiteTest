package com.ui.pages;

import com.codeborne.selenide.Selenide;
import org.junit.After;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BasePage {

    @After
    public void clearLocalStorage() {
        Selenide.executeJavaScript("localStorage.clear()");
    }

    @After
    public void clearCache() {
        clearBrowserCache();
    }

    @After
    public void clearCookieTest() {
        clearBrowserCookies();
    }
}
