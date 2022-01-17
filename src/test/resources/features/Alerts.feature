@Alerts
  Feature:

    Background:
      Given the user is on the toolsqa main page
      And the user clicks alerts,frame&windows button
      And the user clicks Alerts submodule on the left side of the page

      @alert1
      Scenario: Handling  alerts
        When the user clicks the first click me button
        Then the user should click ok button on the pop-up alert
      When the user clicks the second click me button
      Then the user should click ok button after five seconds on the pop-up alert
      When the user clicks the third click me button
      And the user clicks ok button on the pop-up alert
      Then the user should see you selected ok text
      When the user clicks the third click me button
      And the user clicks cancel button on the pop-up alert
      Then the user should see you selected Cancel text
      When the user clicks the fourth click me button
      And the user enters info into the box on the pop-up alert
      And the user clicks ok
      Then user should see You entered text written with the giving info
      When the user clicks the fourth click me button
      And the user enters info into the box on the pop-up alert
