package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.MainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class StepOpenApp extends UIInteractionSteps {

    //AppiumDriver driver;

    MainPage mainPage;
    @Step
    public void goHomePage() throws Throwable{

        mainPage.openPage();
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
        //driver.findElement(By.id("ru.yandex.mail:id/list_mailru")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//View[@resource-id='auth']/View[1]/EditText[0]")).sendKeys("\"testovyy.akkaunt1@bk.ru\"");
        //System.out.println(SystemEnvironmentVariables.createEnvironmentVariables() .getProperty("appium.processArguments"));
    }
    //objectOpen.open();

}




