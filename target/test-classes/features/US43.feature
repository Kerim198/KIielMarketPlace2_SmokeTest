Feature: User should be able to create a new add after entering required datas

  @smoke
  Scenario: US-043-TC-001 Save as button should be enabled when filled mandatory fields
    Given the user is on the login page
    When the user enters the admin credentials
    And the user goes to the "http://environment.kielmarketplace.nl/add_ilan"
    Then Verify save ad button is enabled

  @smoke
  Scenario: US-043-TC-002 See successfully saved ad when click save ad button
    Given the user is on the login page
    When the user enters the user credentials
    And the user goes to the "http://environment.kielmarketplace.nl/add_ilan"
    And Enter required info
    And Click save ad button
    Then Verify the message is "İlanınız başarılı bir şekilde kaydedildi."

