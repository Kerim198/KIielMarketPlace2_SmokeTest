@UNI4-159 @sprint1 @regression @smoke
Feature: US_019 Gecerli bilgiler girilerek sistemde yeni bir hesap olusturulabilmeli.

  Background:
    Given The user goes to "https://kese.nl/signup" page

@UNI4-66
  Scenario: US_019_TC_001 Girilen veriler ile sisteme kayit olabilmeliyim.
    Given Kullanici "Kullanici Adı" kutucuguna gecerli bir isim girer
    When Kullanici "email@gmail" kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer
    And Kullanici "Sifre" kutucuguna gecerli bir sifre girer
    And Kullanici "Sifre tekrari" kutucuguna ayni sifreyi tekrar girer
    And Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler
    And Kullanici "Kayit olustur" butonuna tiklar
    Then Kayit olusturulduktan sonra kullanici "https://kese.nl/login" sayfasina yonlendirilmelidir.

  @UNI4-69
  Scenario: US_019_TC_002 Kullanici adı boş bırakıldığında "Kayit oluştur" butonu aktif olmamalidir.
    Given Kullanici "email@gmail" kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer
    When Kullanici "Sifre" kutucuguna gecerli bir sifre girer
    And Kullanici "Sifre tekrari" kutucuguna ayni sifreyi tekrar girer
    And Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler
    Then Kullanici "Kayit olustur" butonuna tiklayamamalidir.

  @UNI4-70
  Scenario: US_019_TC_003 Kullanici mail adresi bos bırakildiginda "Kayıt olustur" butonu aktif olmamali.
    Given Kullanici "Kullanici Adı" kutucuguna gecerli bir isim girer
    When Kullanici "Sifre" kutucuguna gecerli bir sifre girer
    And Kullanici "Sifre tekrari" kutucuguna ayni sifreyi tekrar girer
    And Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler
    Then Kullanici "Kayit olustur" butonuna tiklayamamalidir.

  @UNI4-71
  Scenario: US_019_TC_004 Kullanici kullanim kosullarini kabul etmezse "Kayıt olustur" butonu aktif olmamali.
    Given Kullanici "Kullanici Adı" kutucuguna gecerli bir isim girer
    When Kullanici "email@gmail" kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer
    And Kullanici "Sifre" kutucuguna gecerli bir sifre girer
    And Kullanici "Sifre tekrari" kutucuguna ayni sifreyi tekrar girer
    Then Kullanici "Kayit olustur" butonuna tiklayamamalidir.

  @UNI4-73
  Scenario: US_019_TC_005 Sifre kutucugu bos birakildiginda "Kayit olustur" butonu aktif olmamali.
    Given Kullanici "Kullanici Adı" kutucuguna gecerli bir isim girer
    When Kullanici "email@gmail" kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer
    And Kullanici "Sifre tekrari" kutucuguna ayni sifreyi tekrar girer
    And Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler
    Then Kullanici "Kayit olustur" butonuna tiklayamamalidir.

  @UNI4-74
  Scenario: US_019_TC_006 Sifre tekrari kutucugu bos birakildiginda "Kayit olustur" butonu aktif olmamali.
    Given Kullanici "Kullanici Adı" kutucuguna gecerli bir isim girer
    When Kullanici "email@gmail" kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer
    And Kullanici "Sifre" kutucuguna gecerli bir sifre girer
    And Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler
    Then Kullanici "Kayit olustur" butonuna tiklayamamalidir.
