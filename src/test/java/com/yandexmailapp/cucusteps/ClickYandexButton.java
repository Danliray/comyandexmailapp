package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepYandexButton;
import cucumber.api.PendingException;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;


public class ClickYandexButton {

    @Steps
    StepYandexButton stepYandexButton;

    @Когда("^пользователь кликнул на кнопку Яндекс$")
    public void пользовательКликнулНаКнопкуЯндекс() throws Throwable{
        stepYandexButton.goToAuth();
    }

    @Тогда("^на форме отображается поле ввода email$")
    public void наФормеОтображаетсяПолеВводаEmail() throws Throwable{
        stepYandexButton.checkPoleEmail();
    }

//    @И("^на форме отображается кнопка \"([^\"]*)\"$")
//    public void наФормеОтображаетсяКнопка(String sigh) throws Throwable {
//        stepYandexButton.checkButtonSigh(sigh);
//        throw new PendingException();
//    }
}
