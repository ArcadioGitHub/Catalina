@ParentTag
Feature: Buscar En Google

  @PrimerScenario
  Scenario: Buscar Motos en Google
    Given el usuatio ingresa a la pagina de google
    When el usuario busca Motos
    Then el primer resultado debe ser la pagina de mercado libre

