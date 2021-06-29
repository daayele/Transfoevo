Feature: Registering for QA Course

  Scenario: Cannot register w/o all fields completed
    Given user is on QA course webpage
    When the user partially fills registration form
    And the user clicks register
    Then the user will get error message
