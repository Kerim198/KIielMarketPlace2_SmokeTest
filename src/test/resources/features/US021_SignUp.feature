@smoke
Feature:US_021 As a user goes to the "/signup" page, the user should not able two enter different
  data two times for creating a new account .
  Background: Successful connection to site and sign up
    Scenario:  The user should not able to created a new account because of entering different data for password
    Given The users go to "https://kese.nl/signup" page
    When The user should enter same data two times for password
    Then The user verifies "Şifreler birbiri ile uyuşmuyor." on signup page