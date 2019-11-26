package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterPassword  extends MobilePageObject {
    public EnterPassword(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="ru.yandex.mail:id/edit_password")
    private WebElement editPass;

    @AndroidFindBy(id="ru.yandex.mail:id/go_to_mail_button")
    private WebElement clickToInbox;

    @AndroidFindBy(xpath="//android.view.ViewGroup[resource-id='ru.yandex.mail:id/toolbar']/android.widget.TextView[1]")
    private WebElement checkInbox;

    public void editPass(String passw){
        $(editPass).sendKeys(passw);;
    }

    public void clickToInbox(){
        $(clickToInbox).waitUntilVisible().click();;
    }

    public void checkInbox(String inbox){
        $(checkInbox).waitUntilVisible().containsText(inbox);;
    }
}
