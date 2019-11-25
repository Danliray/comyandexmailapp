package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepYandexButton;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import net.thucydides.core.annotations.Steps;


public class ClickYandexButton {

    //@Managed(driver = "appium")
    ///WebDriver driver;

    @Steps
    StepYandexButton stepYandexButton;

    @Когда("^пользователь кликнул на кнопку Яндекс$")
    public void пользовательКликнулНаКнопкуЯндекс() throws Throwable{
        stepYandexButton.goToAuth();
    }
}
