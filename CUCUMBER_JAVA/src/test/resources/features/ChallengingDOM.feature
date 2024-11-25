Feature: Interact with Challenging DOM elements

@Smoke
  Scenario: Clicking buttons in Challenging DOM
    Given I am on the home page
    When I click on the "Challenging DOM" link
    Then I click the "foo1" button1
    Then I click the "foo2" button1
    Then I click the "foo3" button3
