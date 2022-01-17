package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage extends BasePage{
    public InteractionsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    public WebElement Droppable;

    @FindBy(id = "draggable")
    public WebElement draggablebox;

    @FindBy(xpath = "(//div[@class='drop-box ui-droppable'])[1]")
    public WebElement droppablebox;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement dropped;


}
