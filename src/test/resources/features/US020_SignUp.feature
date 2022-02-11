@sprint1 @regression @smoke
Feature: US_020 As a user goes to the "/signup" page, the user should be able to create
  a new user account only with the  unique email and username.
  Background: Successful connection to site and sign up
    Given The User goes to "https://kese.nl/signup" page
    When user creates a random credentials and signup
  Scenario Outline: TC_001_US_20 signup block because of repeated email or username
    And user tries to use the same "<statementArea>" for signup again
    Then user verifies "<text>" and can't signup on signup page
    Examples:
      |statementArea|text                                                         |
      |email         |Bu mail adresi zaten kullanılıyor.                           |
      |username      |Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz.|