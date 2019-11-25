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


//    public WebDriver newDriver() {
//        try {
//            DesiredCapabilities capabilities = DesiredCapabilities.android();
//            // Add
//            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        }
//        catch (IOException e) {
//            throw new Error(e);
//        }
//    }

    @AndroidFindBy(id="ru.yandex.mail:id/list_yandex")
    private WebElement mailruBut;

    public void clickButton(){
        //$(By.xpath("//View[@resource-id='auth']/View[1]/EditText[0]")).sendKeys("\"testovyy.akkaunt1@bk.ru\"");
        //WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        //wait.until(ExpectedConditions.visibilityOfElementLocated((org.openqa.selenium.By) mailruBut));
        //$(By.id("ru.yandex.mail:id/list_mailru")).click();
        $(mailruBut).click();
    }
}
