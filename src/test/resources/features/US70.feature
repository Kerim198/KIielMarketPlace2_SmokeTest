@sprint3  @smoke
Feature:

  Scenario Outline: US-70-TC-001 the user login with valid credentials
    Given the user login with "<email>" and "<sifre>"
    When the user send post request to "/user/account/login"
    And the user verifies response body contains following data
      | sonuc    |
      | _id      |
      | username |
      | rol      |
      | token    |
    Then the user verifies the status code is 200
    Examples:
      | email                | sifre         |
      | admin@gmail.com      | Admin123.     |
      | yetkili@gmail.com    | Yetkili123.   |
      | kullanici1@gmail.com | Kullanici123. |

  Scenario Outline: US-70-TC-002 the user login with invalid credentials
    Given the user login with "<email>" and "<sifre>"
    When the user send post request to "/user/account/login"
    And the user verifies response body contains "Unauthorized"
    Then the user verifies the status code is 401
    Examples:
      | email                | sifre          |
      | admin@gmail.com      | Admin123.1     |
      | yetkili@gmail.com    | Yetkili123.2   |
      | kullanici1@gmail.com | Kullanici123.3 |





    #EXAMPLE TEST CASE
#Given Accept type application/xml
#When user send GET request to api/spartans end point
#Then response Content Type must be application/xml
#And response body should be xml format

  #FIRST TEST CASE
  #• When I send a GET request to
  #• http://54.204.128.200:8000/api/spartans
  #• Then Response STATUS CODE must be 200
  #• And I Should see all Spartans data in JSON format

  #http://environment.kielmarketplace.nl/api/user/account/login
  #Doğru email ve şifre bilgileri ile giriş yapabilmeliyim.
  #Giriş yapılırsa "{sonuc: true, _id : ıdBilgisi , username : kullanıcıAdı, rol : kullanıcıTipi}" bilgilerini "200" durum kodu altında alabilmeliyim.
  #Giriş yapılamazsa "{sonuc : false}" cevabını 200 bağlantı kodu ile alabilmeliyim.
  #
  #"Gönderilecek datalar : (body olarak)
  #
  #email : email adresi
  #sifre: şifre bilgisi
  #"

  #Doğru email ve şifre bilgileri ile giriş yapabilmeliyim.
