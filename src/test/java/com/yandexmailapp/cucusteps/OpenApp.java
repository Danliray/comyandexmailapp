package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepOpenApp;
import cucumber.api.java.ru.Пусть;
import net.thucydides.core.annotations.Steps;

public class OpenApp {
    @Steps
    StepOpenApp stepOpenApp;


    @Пусть("^пользователь открыл приложение$")
    public void пользовательОткрылПриложение() throws Throwable{
        stepOpenApp.goHomePage();
    }
}
