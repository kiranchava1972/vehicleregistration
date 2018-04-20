Feature: Vehicle Registration check
  As a User
  I can check my vehicle registration details on gov.uk website.


  @Test01
  Scenario: Check the vehicle registration details
    Given I delete the cookies in the browser
    When I launch the govuk website
    Then I should be on the "Get vehicle information from DVLA - GOV.UK" page
    When I click on start button
    Then I should be on the "Check if a vehicle is taxed and has an MOT" page
    And I enter registration number
    When I click on continue button
    Then I should be on the "Check if a vehicle is taxed and has an MOT" page
    And I close the Browser