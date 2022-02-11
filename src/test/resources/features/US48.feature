
Feature: Send a notification

  #Bir admin olarak bildirimler sayfasında bildirim gonderebilmeliyim.

  #http://environment.kielmarketplace.nl/notification
  #Bildirim içeriğini girdikten sonra, bildirimin gönderileceği kullanıcıyı seçip bildirim gönderebilmeliyim

  Background: Login as an admin
    Given the user is on the login page
    When the user enters the admin credentials
    And user clicks my profile button
    Then the user clicks notifications button

  Scenario: Send notification
    Given send a notification to the local managers

  Scenario:  Send notification
    Given send a notification to the users



