package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySettings extends MobilePageObject {

    public MySettings(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "ru.mail.mailapp:id/open_settings_screen_btn")
    private WebElement settingButton;

    @AndroidFindBy(xpath="//android.view.ViewGroup[resource-id='android:id/action_bar']" +
            "/android.widget.TextView[2]")
    private WebElement goSettingCheck;

    public void settingButton(){
        $(settingButton).waitUntilEnabled().click();
    }

    public void goSettingCheck(String sttng){
        $(goSettingCheck).waitUntilEnabled().shouldContainText(sttng);
    }
}
