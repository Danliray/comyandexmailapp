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
    public void clickToInboxForm() throws Throwable{
        enterPassword.clickToInbox();
    }

    @Step
    public void checkInboxForm(String inbox) throws Throwable{
        enterPassword.checkInbox(inbox);
    }
}
