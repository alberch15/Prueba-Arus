@suite
Feature: CP01

  Background: Yo como usuario quiero

  @CompraExito
  Scenario: Validar informacion de carrito
    Given el usuario navega al sitio web
    When dirigirse al menuy seleccionar categoria y subcategoria
    When seleccionar productos
    When ingresar cantidad de productos a seleccionar
    Then validar infromacion del carrito