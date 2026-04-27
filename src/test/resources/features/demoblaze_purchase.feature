
Feature: Compra de productos en Demoblaze


  Scenario: Compra exitosa de productos
    Given el usuario accede al sitio Demoblaze
    When realiza el flujo de compra
    Then valida que la compra fue exitosa
