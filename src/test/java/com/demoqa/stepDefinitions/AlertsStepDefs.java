package com.demoqa.stepDefinitions;

import com.demoqa.pages.AlertsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AlertsStepDefs {

    AlertsPage alertsPage=new AlertsPage();




    @Given("the user is on the toolsqa main page")
    public void theUserIsOnTheToolsqaMainPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("the user clicks alerts,frame&windows button")
    public void theUserClicksAlertsFrameWindowsButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(alertsPage.AlertsMain);
        alertsPage.AlertsMain.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user clicks Alerts submodule on the left side of the page")
    public void theUserClicksAlertsSubmoduleOnTheLeftSideOfThePage() {
        BrowserUtils.scrollToElement(alertsPage.Alerts);
        alertsPage.Alerts.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks the first click me button")
    public void theUserClicksTheFirstClickMeButton() {
        alertsPage.Clickme1.click();
    }

    @Then("the user should click ok button on the pop-up alert")
    public void theUserShouldClickOkButtonOnThePopUpAlert() {

        BrowserUtils.waitFor(2);
        Alert alert=new Driver().get().switchTo().alert();
        alert.accept();
    }

    @When("the user clicks the second click me button")
    public void theUserClicksTheSecondClickMeButton() {
        alertsPage.Clickme2.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the user should click ok button after five seconds on the pop-up alert")
    public void theUserShouldClickOkButtonAfterFiveSecondsOnThePopUpAlert() {

        Alert alert=new Driver().get().switchTo().alert();
        alert.accept();



    }

    @When("the user clicks the third click me button")
    public void theUserClicksTheThirdClickMeButton() {
        alertsPage.Clickme3.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user clicks ok button on the pop-up alert")
    public void theUserClicksOkButtonOnThePopUpAlert() {
        Alert alert=new Driver().get().switchTo().alert();
        alert.accept();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should see you selected ok text")
    public void theUserShouldSeeYouSelectedOkText() {
        Assert.assertTrue(alertsPage.confirmtext.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @And("the user clicks cancel button on the pop-up alert")
    public void theUserClicksCancelButtonOnThePopUpAlert(){

        BrowserUtils.waitFor(2);
        Alert alert=new Driver().get().switchTo().alert();
        alert.dismiss();
        BrowserUtils.waitFor(4);
    }

    @Then("the user should see you selected Cancel text")
    public void theUserShouldSeeYouSelectedCancelText() {
        Assert.assertTrue(alertsPage.confirmtext.isDisplayed());
    }

    @When("the user clicks the fourth click me button")
    public void theUserClicksTheFourthClickMeButton() {
        alertsPage.Clickme4.click();
    }

    @And("the user enters info into the box on the pop-up alert")
    public void theUserEntersInfoIntoTheBoxOnThePopUpAlert() {
        BrowserUtils.waitFor(2);
        Alert alert=new Driver().get().switchTo().alert();
        BrowserUtils.waitFor(2);
        alert.sendKeys("John");
        BrowserUtils.waitFor(3);
        alert.accept();
    }

    @And("the user clicks ok")
    public void theUserClicksOk() {

    }

    @Then("user should see You entered text written with the giving info")
    public void userShouldSeeYouEnteredTextWrittenWithTheGivingInfo() {
        Assert.assertTrue(alertsPage.prompttext.isDisplayed());
    }

}
