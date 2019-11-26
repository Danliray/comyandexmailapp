package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

public class EnterLoginEmail extends MobilePageObject {
    public EnterLoginEmail(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "ru.yandex.mail:id/edit_login")
    //@AndroidFindBy(xpath = "[@resource-id='ru.yandex.mail:id/edit_login'")
    private WebElement editEmail;

    @AndroidFindBy (id = "ru.yandex.mail:id/button_next")
    private WebElement clickButton;

    @AndroidFindBy(id = "ru.yandex.mail:id/text_primary_display_name")
    private WebElement labelEmail;

    public void editEmail(String email){
        $(editEmail).waitUntilEnabled().sendKeys(email);;
    }

    public void clickButton(String buttonText){
        $(clickButton).waitUntilVisible().shouldContainText(buttonText);
        $(clickButton).waitUntilClickable().click();
    }

    public void labelEmail(String label){
        $(labelEmail).waitUntilEnabled().shouldContainText(label);;
    }
}
