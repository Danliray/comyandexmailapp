package com.yandexmailapp.pageObjects;

import java.util.concurrent.TimeUnit;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class MobilePageObject extends PageObject {

    public MobilePageObject(final WebDriver driver) {
        super(driver, page -> {

            PageFactory
                    .initElements(new AppiumFieldDecorator( ((WebDriverFacade) page.getDriver()).getProxiedDriver(),
                            page.getImplicitWaitTimeout()), page);
            return true;
        });
    }
}
