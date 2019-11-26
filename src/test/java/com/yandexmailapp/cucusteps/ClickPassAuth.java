package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepPassAuth;
import cucumber.api.PendingException;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class ClickPassAuth {
    @Steps
    StepPassAuth stepPassAuth;

    @Когда("^пользователь вводит в поле пароля \"([^\"]*)\"$")
    public void пользовательВводитВПолеПароля(String passw) throws Throwable {
        stepPassAuth.editPassword(passw);
        throw new PendingException();
    }


    @И("^кликает на кнопку Continue to inbox формы приветствия$")
    public void кликаетНаКнопкуContinueToInboxФормыПриветствия() throws Throwable{
        stepPassAuth.clickToInboxForm();
        throw new PendingException();
    }

    @Тогда("^пользователь переходит на страницу \"([^\"]*)\"$")
    public void пользовательПереходитНаСтраницу(String inbox) throws Throwable {
        stepPassAuth.checkInboxForm(inbox);
        throw new PendingException();
    }


}
