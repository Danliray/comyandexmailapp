package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterPassword  extends MobilePageObject {
    public EnterPassword(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="ru.mail.mailapp:id/password")
    private WebElement editPass;

    @AndroidFindBy(id="ru.mail.mailapp:id/sign_in")
    private WebElement clickSigh;

    @AndroidFindBy(id="ru.mail.mailapp:id/button_skip")
    private WebElement clickToSkip;

    @AndroidFindBy(id="ru.mail.mailapp:id/welcome_done")
    private WebElement clickToDone;

    @AndroidFindBy(id="ru.mail.mailapp:id/tutorial_close")
    private WebElement clickToKrest;

    @AndroidFindBy(id="ru.mail.mailapp:id/folder_name")
    private WebElement checkInbox;

    public void editPass(String passw){
        $(editPass).waitUntilVisible().sendKeys(passw);
    }

    public void clickSigh(String sighBut){
        $(clickSigh).waitUntilVisible().shouldContainText(sighBut);
        $(clickSigh).click();
    }

    public void clickToSkip(String skip){
        $(clickToSkip).waitUntilVisible().shouldContainText(skip);
        $(clickToSkip).waitUntilClickable().click();;
    }

    public void clickToDone(String done){
        $(clickToDone).waitUntilVisible().shouldContainText(done);
        $(clickToDone).waitUntilClickable().click();
    }

    public void clickToKrest(){
        $(clickToKrest).waitUntilVisible().click();
    }

    public void checkInbox(String inbox){
        $(checkInbox).waitUntilVisible().shouldContainText(inbox);
    }


}
