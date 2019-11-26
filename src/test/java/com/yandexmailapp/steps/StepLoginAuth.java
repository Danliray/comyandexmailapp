package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.EnterLoginEmail;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class StepLoginAuth extends UIInteractionSteps {
    EnterLoginEmail enterLoginEmail;

    @Step
    public void enterEmail(String email) throws Throwable{
        enterLoginEmail.editEmail(email);
    }

    @Step
    public void clickButtonNext(String buttonText) throws Throwable{
        enterLoginEmail.clickButton(buttonText);
    }

    @Step
    public void checkLabelEmail(String label) throws Throwable{
        enterLoginEmail.labelEmail(label);
    }
}
