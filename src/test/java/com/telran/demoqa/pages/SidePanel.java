package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends PageBase {

    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-wrapper']/*[.='Book Store Application']")
    WebElement bookStoreAppBtn;

    public BookStorePage getBookStorePage() {
        clickWithJSExecutor(bookStoreAppBtn, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(css = ".show #item-2")
    WebElement bookStoreBtn;

    public BookStorePage getBookStore() {
        clickWithJSExecutor(bookStoreBtn, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(css = ".show #item-3")
    WebElement profileBtn;

    public ProfilePage clickOnProfileButton() {
        clickWithJSExecutor(profileBtn,0,300);
        return new ProfilePage(driver);
    }
}