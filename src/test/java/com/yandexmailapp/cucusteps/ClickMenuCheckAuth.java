package com.yandexmailapp.cucusteps;

import com.yandexmailapp.steps.StepMenuCheckAuth;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class ClickMenuCheckAuth {
    @Steps
    StepMenuCheckAuth stepMenuCheckAuth;
    
    @Когда("^пользователь нажимает на кнопку меню$")
    public void пользовательНажимаетНаКнопкуМеню() throws Throwable {
        stepMenuCheckAuth.menuButtonOpen();
    }

    @Тогда("^отображается email \"([^\"]*)\"$")
    public void отображаетсяEmail(String labelEm) throws Throwable {
        stepMenuCheckAuth.menuLabelEmail(labelEm);
        throw new PendingException();
    }
}
