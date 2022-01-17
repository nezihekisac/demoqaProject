package com.demoqa.stepDefinitions;

import com.demoqa.pages.WidgetsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WidgetsStepDefs {

    WidgetsPage widgetsPage = new WidgetsPage();


    @Given("the user is on the Toolsqa main page")
    public void theUserIsOnTheToolsqaMainPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user clicks widgets button")
    public void theUserClicksWidgetsButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(widgetsPage.WidgetsMain);
        widgetsPage.WidgetsMain.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user clicks tool tips submodule on the left side of the page")
    public void theUserClicksToolTipsSubmoduleOnTheLeftSideOfThePage() {
        BrowserUtils.scrollToElement(widgetsPage.ToolTipsButton);
        widgetsPage.ToolTipsButton.click();
        BrowserUtils.waitFor(3);
    }

    @And("the user hover over on the hover me to see button")
    public void theUserHoverOverOnTheHoverMeToSeeButton() {
       WebDriver driver;
        Actions action = new Actions(new Driver().get());
        action.moveToElement(widgetsPage.hoverMeToSeeButton).perform();
        BrowserUtils.waitFor(2);

        String expectedtext = "You hovered over the Button";
        String tooltiptext1 = widgetsPage.hoverMeToSeeToolTip.getText();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedtext, tooltiptext1);
    }

    @Then("the user should be able to see you hovered over the button tooltip")
    public void theUserShouldBeAbleToSeeYouHoveredOverTheButtonTooltip() {

    }

    @And("the user hover over on the hover me to see text field")
    public void theUserHoverOverOnTheHoverMeToSeeTextField() {
    }

    @Then("the user should be able to see you hovered over the text field tooltip")
    public void theUserShouldBeAbleToSeeYouHoveredOverTheTextFieldTooltip() {

        Actions action = new Actions(new Driver().get());
        action.moveToElement(widgetsPage.hoverMeToSeeTextField).perform();
        BrowserUtils.waitFor(2);


        String expectedtext2 = "You hovered over the text field";
        String tooltiptext2 = widgetsPage.hoverMeToSeeTextFieldtooltip.getText();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedtext2, tooltiptext2);
    }
}