package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "(//div[.='Alerts, Frame & Windows'])[2]")
    public WebElement pageSubTitle;

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[3]")
    public WebElement AlertsMain;

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[4]")
    public WebElement WidgetsMain;

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[5]")
    public WebElement InteractionsMain;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public String getPageSubTitle() {

        return pageSubTitle.getText();
    }
}
