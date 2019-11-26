package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.MenuCheckAuth;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class StepMenuCheckAuth extends UIInteractionSteps {
    MenuCheckAuth menuCheckAuth;

    @Step
    public void menuButtonOpen() throws Throwable{
        menuCheckAuth.openMenu();
    }

    public void menuLabelEmail(String labelEm) throws Throwable{
        menuCheckAuth.labelEmail(labelEm);
    }
}
