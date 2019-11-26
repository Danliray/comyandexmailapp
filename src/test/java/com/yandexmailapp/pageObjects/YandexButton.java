package com.yandexmailapp.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;


public class YandexButton extends MobilePageObject {

    public YandexButton(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="ru.yandex.mail:id/list_yandex")
    private WebElement mailruBut;

    @AndroidFindBy(id="ru.yandex.mail:id/layout_login")
    private WebElement checkPole;

    @AndroidFindBy(id="ru.yandex.mail:id/button_next")
    private WebElement checkButton;

    public void clickButton(){

        $(mailruBut).waitUntilEnabled().click();
    }

    public void checkPole(){
        $(checkPole).waitUntilEnabled().shouldBeVisible();;
    }

//    public void checkButton(String sigh){
//        $(checkButton).waitUntilEnabled().shouldContainText(sigh);;
//    }
}
