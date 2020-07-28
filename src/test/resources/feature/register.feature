Feature: Registration feature
  @Test
  Scenario: User should able to register successfully,
  so user can use all functionality
    Given  user is already on homepage
    When user clicks on register button
    And user enter all required registration details
    And user clicks on register submit button
    Then user should able to register successfully