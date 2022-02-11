@sprint1 @regression @smoke
Feature: "US_018 Bir kullanıcı olarak ""/login"" sayfasına girdiğimde, sisteme giriş yapabilmeliyim."

  Background: The user goes to "https://kese.nl/login" page
    Given The user goes to "https://kese.nl/login" page

  Scenario: US018_TC_001 The user should be directed to the home page after logging in by using the correct information.
    When The user login to the system by using username and password
    Then The user is redirected to the homepage as logged in and sees the profilim button at the top right



  Scenario Outline: US018_TC_002 If any information is entered incorrectly "Email ya da şifre hatalı." text should be visible.
    When The user enters the wrong "<Username>" or "<Password>" information or both information incorrectly and clicks the US018_LoginPage button
    Then User "Email ya da şifre hatalı." sees the text.

    Examples:
    |Username                   |Password |
    |kullanici1@gmail.com       |AAAA     |
    |kullanici1@gmail.com       |Ab9*#$%&^|
    |kullanici1@gmail.com       |1234''\/?|
    |kullanici1@gmail.com       |abc1234  |
    |hataliusername123@gmail.com|1234     |
    |hataliusername*#@gmail.com |1234     |
    |kullanici1.gmail.com       |1234     |
    |kullanici1@gmail           |1234     |
    |                           |1234     |
    |kullanici1@gmail.com       |         |
    |                           |         |








