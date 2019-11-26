package com.yandexmailapp.steps;

import com.yandexmailapp.pageObjects.YandexButton;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class StepYandexButton extends UIInteractionSteps {

    YandexButton yandexButton;

    @Step
    public void goToAuth() throws Throwable{
        yandexButton.clickButton();
    }

    @Step
    public void checkPoleEmail() throws Throwable{
        yandexButton.checkPole();
    }

}
