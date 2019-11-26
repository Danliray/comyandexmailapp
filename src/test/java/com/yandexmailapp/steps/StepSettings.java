package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.MySettings;
import net.thucydides.core.annotations.Step;
import org.yecht.Data;

public class StepSettings {
    MySettings mySettings;

    @Step
    public  void clickToSettings() throws Throwable {
        mySettings.settingButton();
    }

    @Step
    public  void goToSettings(String sttng) throws Throwable {
        mySettings.goSettingCheck(sttng);
    }
}
