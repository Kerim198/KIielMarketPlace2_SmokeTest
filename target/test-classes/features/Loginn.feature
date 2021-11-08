
@smoke
Feature: Login

  # yeni oluşturulmuş veya username ve password bir stepte yazılacaksa bunu kullan
  Scenario: Login as a created new user
    Given the user is on the login page
    When the user enters "admin@gmail.com" and "Admin123."
    Then the user should be able to login

    # admin olarak giriş yapılacağı zaman bunu kullan
  Scenario: Login as a admin
    Given the user is on the login page
    When the user enters the admin credentials
    Then the user should be able to login

    #user olarak giriş yapılacağı zaman bunu kullan
  Scenario: Login as a user
    Given the user is on the login page
    When the user enters the user credentials
    Then the user should be able to login

    # yetkili olarak giriş yapılacağı zaman bunu kullan
  Scenario: Login as a local manager
    Given the user is on the login page
    When the user enters the local manager credentials
    Then the user should be able to login

