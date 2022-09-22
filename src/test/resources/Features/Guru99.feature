Feature: Testing the Functionality of Guru99.com

  @tag1
  Scenario: Test the valid Sign-In
    Given User is on login page
    When user enters username and password
    And clicks on sign-in button
    Then user should land on home page

  @tag2
  Scenario: Test Dropdown and other methods
    Given User is on Radio and checkbox buttons page
    When use clicks  radio button
    And user clicks on checkbox
    Then User  should able to perform actions

  @tag3
  Scenario: Test Drag and Drop feature
    Given user is on Drag and drop page
    Then user performs drag and drop action

  @tag4
  Scenario: Test File Upload methods
    Given User is on file upload page
    When user performs file upload action
    Then File Uploading should be successfully completed

  @tag5
  Scenario: Test Alerts and popups
    Given User is on Alets Page tab
    When User Performs actions
    Then alerts and popups should be handled succesfully
