Feature: Compra de productos en Demoblaze

  Como usuario de Demoblaze
  Quiero realizar una compra de productos
  Para validar que el flujo de compra funciona correctamente

  Scenario Outline: Compra exitosa de productos en Demoblaze
    Given el usuario ingresa a la pagina Demoblaze
    When agrega al carrito el producto "<producto>"
    And visualiza el carrito de compras
    And completa el formulario de compra con los datos del cliente
    Then la compra se realiza de forma exitosa mostrando el mensaje de confirmación

  Examples:
    | producto             |
    | Samsung galaxy s6    |
    | Nokia lumia 1520     |