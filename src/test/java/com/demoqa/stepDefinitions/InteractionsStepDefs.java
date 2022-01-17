package com.demoqa.stepDefinitions;

import com.demoqa.pages.InteractionsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class InteractionsStepDefs  {

    InteractionsPage interactionsPage=new InteractionsPage();



    @When("the user clicks interactions button")
    public void theUserClicksInteractionsButton() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(interactionsPage.InteractionsMain);
        interactionsPage.InteractionsMain.click();
        BrowserUtils.waitFor(3);
    }

    @And("the user clicks droppable submodule on the left side of the page")
    public void theUserClicksDroppableSubmoduleOnTheLeftSideOfThePage() {
        BrowserUtils.scrollToElement(interactionsPage.Droppable);
        interactionsPage.Droppable.click();
        BrowserUtils.waitFor(3);
    }

    @And("the user drag the dragme boz on to the drop here box")
    public void theUserDragTheDragmeBozOnToTheDropHereBox() {

        WebDriver driver;
        Actions action=new Actions(new Driver().get());


        action.dragAndDrop(interactionsPage.draggablebox,interactionsPage.droppablebox).build().perform();

        BrowserUtils.waitFor(3);


    }

    @Then("drag me box should be dropped on the drop here box")
    public void dragMeBoxShouldBeDroppedOnTheDropHereBox() {
        Assert.assertTrue(interactionsPage.dropped.isDisplayed());

    }
}
