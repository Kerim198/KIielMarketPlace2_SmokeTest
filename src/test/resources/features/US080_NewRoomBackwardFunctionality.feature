@UNI4-311 @sprint2 @regression @smoke
Feature: US_080	As a user, I should be able to go back to the other steps
  except the first step "Oda Kirala & Değişim" add creation page.

  Background: login
    Given user goes to "http://test.kese.nl/login" page US_Eighty
    And user logs into website US_Eighty
    And user goes to "http://test.kese.nl/new_room" page US_Eighty

  @UNI4-300  @UNI4-302  @UNI4-303  @UNI4-304  @UNI4-305 @UNI4-306  @UNI4-307  @UNI4-308 @UNI4-309
  Scenario Outline: US080_TC01 to US080_TC09 When the user clicks the forward button and comes back again,
  they should find their previous selections saved.
    #First Page
    And user chooses "<House Type>" as house type on the new room, step first page US_Eighty
    And user clicks to "first checkbox" on the new room, step first page US_Eighty
    And user clicks to "second checkbox" on the new room, step first page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies "<House Type>" is selected on the new room step first page US_Eighty
    Then user verifies that "first checkbox" is selected US_Eighty
    Then user verifies that "second checkbox" is selected US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    #Second Page
    And user chooses "Arizona, Amerika Birleşik Devletleri" as a location from the list in new room, step second page US_Eighty
    And user inputs "3" between the house and the bus stop on the new room, step second page US_Eighty
    And user inputs "3" between the house and the train stop on the new room, step second page US_Eighty
    And user inputs "3" between the house and subway stop on the new room, step second page US_Eighty
    And user clicks to "checkbox" on the new room, step second page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies "Arizona, Amerika Birleşik Devletleri" is visible US_Eighty
    Then user verifies the between the house and the bus stop is "3" km selected on the new room, step second page US_Eighty
    Then user verifies the between the house and the train stop is "3" km selected on the new room, step second page US_Eighty
    Then user verifies the between the house and the subway stop is "3" km on the new room, step second page US_Eighty
    Then user verifies that "checkbox" is selected on the new room, step second page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    #Third Page
    And user enters the "70" as an area of the room on the new room step third page US_Eighty
    And user clicks ones on the all increment button of all areas that you can use in your home on the new room, step third page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies the value of usage area input is "70" on the new room, step third page US_Eighty
    Then user verifies that the numbers are 2 1 1 1 on the new room, step third page US_Eighty
    Then user clicks to the forward button on the new room page US_Eighty
    #Fourth Page
    And user chooses the "<Age Range>" age range on the new room, step fourth page US_Eighty
    And user chooses the "<Gender>" as a gender on the new room, step fourth page US_Eighty
    And user clicks ones on the increment button of maximum number of people on the new room, step fourth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies the "<Age Range>" age range selected on the new room, step fourth page US_Eighty
    Then user verifies the "<Gender>" is selected as a gender on the new room, step fourth page US_Eighty
    Then user verifies the selected maximum number of people number is 1 on the new room, step fourth page US_Eighty
    Then user clicks to the forward button on the new room page US_Eighty
    #Fifth Page
    And user selects everything in the list of amenities that the homeowner can provide on the new room, step fifth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    And user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies the all options are selected on the new room, step fifth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    #Sixth Page
    And user types a description as "Home, sweet home!" to the input box on the new room, step sixth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    Then user verifies that the text in the descriptions box says "Home, sweet home!" on the new room, step sixth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
     #Seventh Page
    And the user chooses the all activities from activities to do around the house on the new room step seventh page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    And user verifies the all options are selected on the new room, step seventh page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
     #Eighth Page
    And user clicks to the all "<Special Conditions>" options on the new room, step eighth page US_Eighty
    And  user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    And user verifies the all "<Special Conditions>" options are selected on the new, room step eighth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    #Ninth Page
    And user chooses the date on the new room, step ninth page US_Eighty
    And user clicks to the forward button on the new room page US_Eighty
    Then user verifies the back button is enabled US_Eighty
    And user clicks to the back button US_Eighty
    And user verifies "Seçtiğiniz Tarihler" is visible on the new room, step ninth page US_Eighty

    Examples:
      | House Type       | Age Range | Gender    | Special Conditions |
      | Müstakil Ev      | 10-65+    | Kadin     | Evet               |
      | Apartman Dairesi | Farketmez | Erkek     | Hayır              |
      | Stüdyo Daire     |           | Farketmez |                    |
