package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepSettings;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class ClickSettings {
    @Steps
    StepSettings stepSettings;

    @Когда("^пользователь нажимает на кнопку настроек$")
    public void пользовательНажимаетНаКнопкуНастроек() throws Throwable{
        stepSettings.clickToSettings();
    }

    @Тогда("^пользователь переходит в \"([^\"]*)\"$")
    public void пользовательПереходитВ(String sttngs) throws Throwable {
        stepSettings.goToSettings(sttngs);

    }
}
