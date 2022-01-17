package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage extends BasePage {

    public WidgetsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//li[@id='item-6'])[2]")
    public WebElement ToolTipsButton;

    @FindBy(id = "toolTipButton")
    public WebElement hoverMeToSeeButton;

    @FindBy(id = "buttonToolTip")
    public WebElement hoverMeToSeeToolTip;


    @FindBy(id = "toolTipTextField")
    public WebElement hoverMeToSeeTextField;

    @FindBy(id = "textFieldToolTip" )
    public WebElement hoverMeToSeeTextFieldtooltip;


}
