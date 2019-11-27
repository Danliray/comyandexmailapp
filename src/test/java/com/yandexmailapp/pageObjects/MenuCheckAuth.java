package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuCheckAuth extends MobilePageObject {
    public MenuCheckAuth (WebDriver driver) {
        super(driver);
    }
        @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
        private WebElement openMenu;

        @AndroidFindBy(id="ru.mail.mailapp:id/current_account_login")
        private WebElement labelEmail;

        public void openMenu(){
            $(openMenu).waitUntilVisible().click();
        }

        public void labelEmail(String labelEm){
            $(labelEmail).waitUntilVisible().shouldContainText(labelEm);
        }
}
