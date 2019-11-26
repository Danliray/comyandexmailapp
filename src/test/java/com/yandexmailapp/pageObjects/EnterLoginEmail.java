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

    @AndroidFindBy(id = "ru.mail.mailapp:id/login")
    private WebElement editEmail;

    @AndroidFindBy (id = "ru.mail.mailapp:id/proceed_to_pass")
    private WebElement clickButton;

    @AndroidFindBy(id = "ru.mail.mailapp:id/user_email")
    private WebElement labelEmail;

    public void editEmail(String email){
        $(editEmail).waitUntilEnabled().sendKeys(email);;
    }

    public void clickButton(String buttonText){
        $(clickButton).waitUntilVisible().shouldContainText(buttonText);
        $(clickButton).click();
    }

    public void labelEmail(String label){
        $(labelEmail).waitUntilEnabled().shouldContainText(label);;
    }
}
