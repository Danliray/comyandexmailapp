package com.yandexmailapp;

import cucumber.api.CucumberOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


import java.net.URL;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        //glue = "com.yandexmailruapp"
)

public class RunTest {

    //@Managed (driver = "appium")
    //WebDriver driver;
     //AppiumDriver driver;

//
//     @BeforeClass
//     public static void setEnvironment()
//     {
//         System.setProperty( "environment", "automation" );
//     }

//    @Before
//    public void setUp() throws Throwable {
//    //Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "Pixel_2_API_28");
//        desiredCapabilities.setCapability("platformVersion", "9");
//        desiredCapabilities.setCapability("automationName", "Appium");
//        desiredCapabilities.setCapability("appPackage", "ru.yandex.mail");
//        desiredCapabilities.setCapability("appActivity", "ru.yandex.mail.ui.LoginActivity");
//        desiredCapabilities.setCapability("app", "C:/Users/Andy/IdeaProjects/mymailrutestest2/apk/yandexmail.apk");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);



//        driver.findElement(By.id("ru.yandex.mail:id/list_mailru")).click();
//        driver.findElement(By.xpath("//View[@resource-id='auth']/View[1]/EditText[0]")).click();
//}

    @After
    public void tearDown(){
        //driver.quit();
    }


//    public void firstTest() {
//
//
//        System.out.println("First test run");
//
//    }

    //@FindBy()
}
