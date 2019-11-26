package com.yandexmailapp.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuCheckAuth extends MobilePageObject {
    public MenuCheckAuth (WebDriver driver) {
        super(driver);
    }
        @AndroidFindBy(xpath="//android.view.ViewGroup[resource-id='ru.yandex.mail:id/toolbar']/android.widget.ImageButton[0]")
        private WebElement openMenu;

        @AndroidFindBy(id="ru.yandex.mail:id/account_switcher_subtitle")
        private WebElement labelEmail;

        public void openMenu(){
            $(openMenu).waitUntilVisible().click();
        }

        public void labelEmail(String labelEm){
            $(labelEmail).waitUntilVisible().shouldContainText(labelEm);
        }
}
