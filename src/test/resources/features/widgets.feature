@Widgets
Feature:

  Scenario:
    Given the user is on the Toolsqa main page
    When the user clicks widgets button
    And the user clicks tool tips submodule on the left side of the page
    And the user hover over on the hover me to see button
    Then the user should be able to see you hovered over the button tooltip
    And the user hover over on the hover me to see text field
    Then the user should be able to see you hovered over the text field tooltip

