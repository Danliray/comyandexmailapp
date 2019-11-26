package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepLoginAuth;
import cucumber.api.PendingException;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class ClickLoginAuth {
    @Steps
    StepLoginAuth stepLoginAuth;

    @Когда("^пользователь вводит в поле email \"([^\"]*)\"$")
    public void пользовательВводитВПолеEmail(String email) throws Throwable {
        stepLoginAuth.enterEmail(email);
        throw new PendingException();
    }

//    @И("^пользователь нажимает на кнопку Next$")
//    public void пользовательНажимаетНаКнопкуNext() throws Throwable {
//        stepLoginAuth.clickButtonNext();
//    }

    @И("^пользователь нажимает на кнопку \"([^\"]*)\"$")
    public void пользовательНажимаетНаКнопку(String buttonText) throws Throwable {
        stepLoginAuth.clickButtonNext(buttonText);
        throw new PendingException();
    }

    @Тогда("^на форме отображается строка email \"([^\"]*)\"$")
    public void наФормеОтображаетсяСтрокаEmail(String label) throws Throwable {
        stepLoginAuth.checkLabelEmail(label);
        throw new PendingException();
    }


}
