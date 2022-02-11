@sprint2 @regression @smoke @ui

Feature: US_055 As a user, on the "Home Exchange" posting page, I should be able to go back through all the steps except the first step.

  Background:
    Given the user is on the login page
    When the user enters the user credentials
    Then the user should be able to login
    When the user clicks advertise button
    And the user clicks home exchange link
  #  Then the user should be on the "Ev Tipi" page


# TC_001_US_055	The "Geri" button should be enabled in all steps except the first step
  # TC_002_US_055	When an user comes back to the provious step, the all informations user previously added should be visible
  Scenario Outline: TC_001_US_055 and TC_002_US_055
    Given  user chooses "<ev tipi>" as house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies "<ev tipi>" is selected on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And user clicks to the checkbox on the new home step two page
    And user types "1" to the ev otobus input on the new home step two page
    And user types "1" to the ev tren input on the new home step two page
    And user types "1" to the ev tramway input on the new home step two page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies "London, Birleşik Krallık" is visible on the new home step two page
    And user verifies the variable of ev otobus input equals "1" on the new home step two page
    And user verifies the variable of ev tren input equals "1" on the new home step two page
    And user verifies the variable of ev tramway input equals "1" on the new home step two page
    And user verifies the checkbox is checked on the new home step two page
    And user clicks to the ilerle button on the new home page
    And user types usage area as "120" to the input on the new home step three page
    And user clicks on the increment buttons on the new home step three page
    And user verifies that the numbers are 2 1 1 1 on the new home step three pagee
    And user verifies the value of usage area input is "120" on the new home step three pagee
    And user clicks to the ilerle button on the new home page
    And user clicks on the increment buttons on the new home step four page
    And user clicks on the increment buttons on the new home step four page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies that the numbers are 2 2 2 2 2 2 2 2 on the new home step four pagee
    And user clicks to the ilerle button on the new home page
    And user clicks to the all options on the new home step five page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies the all options are selected on the new home step five page
    And user clicks to the ilerle button on the new home page
    And user types a description as "asdf" to the input on the new home step six page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies the value of description input is same with "asdf" on the new home step six page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all options on the new home step seven page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies the all options are selected on the new home step seven page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all hayir options on the new home step eight page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button
    And user verifies the all hayir options are selected on the new home step eight page
    And user clicks to the ilerle button on the new home page
    And user chooses the date on the new home step nine page
    And user verifies "Seçtiğiniz Tarihler" is visible new home step nine page
    And user clicks to the ilerle button on the new home page
    And user verifies the geri button is enabled
    And user clicks to the geri button

    Examples:
      | ev tipi          |
      | Müstakil Ev      |
      | Apartman Dairesi |
      | Stüdyo Daire     |