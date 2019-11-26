package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.EnterPassword;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class StepPassAuth  extends UIInteractionSteps {
    EnterPassword enterPassword;

    @Step
    public void editPassword(String passw) throws Throwable{
        enterPassword.editPass(passw);
    }

    @Step
    public void clickSighButton(String sighBut) throws Throwable{
        enterPassword.clickSigh(sighBut);
    }

    @Step
    public void clickToSkipForm(String skip) throws Throwable{
        enterPassword.clickToSkip(skip);
    }

    @Step
    public void clickDoneForm(String done) throws Throwable{
        enterPassword.clickToDone(done);
    }

    @Step
    public void clickKrest() throws Throwable{
        enterPassword.clickToKrest();
    }

    @Step
    public void checkInboxForm(String inbox) throws Throwable{
        enterPassword.checkInbox(inbox);
    }
}
