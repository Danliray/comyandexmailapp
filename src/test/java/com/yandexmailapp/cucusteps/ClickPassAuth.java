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

    }

    @И("^пользователь кликает на кнопку \"([^\"]*)\"$")
    public void пользовательКликаетНаКнопку(String sighBut) throws Throwable {
        stepPassAuth.clickSighButton(sighBut);

    }

    @И("^нажимает на кнопку \"([^\"]*)\"$")
    public void нажимаетНаКнопкуДваРаза(String skip) throws Throwable {
        stepPassAuth.clickToSkipForm(skip);

    }

    @И("^кликает на \"([^\"]*)\"$")
    public void кликаетНа(String done) throws Throwable {
        stepPassAuth.clickDoneForm(done);

    }

    @И("^кликает на крестик$")
    public void кликаетНаКрестик() throws Throwable{
        stepPassAuth.clickKrest();
    }

    @Тогда("^пользователь переходит на страницу \"([^\"]*)\"$")
    public void пользовательПереходитНаСтраницу(String inbox) throws Throwable {
        stepPassAuth.checkInboxForm(inbox);

    }
}
