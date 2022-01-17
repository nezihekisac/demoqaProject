package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage{

    public AlertsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div[class='main-header']")
    public WebElement alertspagetitle;

    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement Alerts;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement Clickme1;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement Clickme2;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement Clickme3;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement Clickme4;

    @FindBy(id = "confirmResult")
    public WebElement confirmtext;

    @FindBy(id = "promptResult")
    public WebElement prompttext;

}
