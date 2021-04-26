Feature: Search a Product
  Scenario: Search Product Simple with Success
    Given I access Petz homepage
    When I search "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then I see a list of Product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    And I click in product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then show the title "Aquário Boyu Curvo 100 187 Litros Preto Champagne" and price "R$ 3.199,99"