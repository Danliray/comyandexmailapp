package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.YandexButton;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class StepYandexButton extends UIInteractionSteps {
//    AppiumDriver driver;

    YandexButton yandexButton;

    @Step
    public void goToAuth() throws Throwable{
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "Pixel_2_API_28");
//        desiredCapabilities.setCapability("platformVersion", "9");
//        desiredCapabilities.setCapability("automationName", "Appium");
//        desiredCapabilities.setCapability("appPackage", "ru.yandex.mail");
//        desiredCapabilities.setCapability("appActivity", "ru.yandex.mail.ui.LoginActivity");
//        desiredCapabilities.setCapability("app", "C:/Users/Andy/IdeaProjects/mymailrutestest2/apk/yandexmail.apk");
//
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        yandexButton.clickButton();
    }
}
