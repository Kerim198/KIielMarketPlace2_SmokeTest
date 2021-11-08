@sprint2 @smoke
Feature: As a User I should be able to sign out with "Cikis" button
  Background: Login with valid credentials
    Given the user is on the login page
    When the user enters the user credentials

  @SignOut
  Scenario: Sign out page should be active.
    Given user clicks my profile button
    Then logout button should be enable

  @SignOut
  Scenario: After logout the page login button should be visible instead my profile button.
    Given user clicks my profile button
    Given User clicks the logout button
    Then User should be able to see login button

  #Bir kullanıcı olarak çıkış yap linkine tıklayarak sistemden çıkış yapabilmeliyim.
  # http://environment.kielmarketplace.nl/
  #	Çıkış yap linki aktif olmalıdır.
  #	Linke tıkladıktan sonra "Profilim" butonunun bulunduğu yerde "Giriş Yap" butonu yer almalıdır.
  #
  #