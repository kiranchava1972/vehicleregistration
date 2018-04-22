Feature: Vehicle Registration check
  As a User
  I can check my vehicle registration details on gov.uk website.


  @Test01
  Scenario: Check the vehicle registration details
    Given govuk website and I launch it
    When I click on start button
    Then I should be on the "Check if a vehicle is taxed and has an MOT" page
    When I enter registration number and I click on continue button
    Then I should be on the "Check if a vehicle is taxed and has an MOT" page
    When I validate Vehicle details and I click on continue button
    Then I should be on the "Check if a vehicle is taxed and has an MOT" page
    And I validate Vehicle details
    And I close the Browser