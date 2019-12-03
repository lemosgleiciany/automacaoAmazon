Feature: Eu como cliente
Quero pesquisar um produto e adicionar no carrinho
Para executar uma compra

  @tag1
  Scenario: Pesquisar livro e adicionar o mais barato
    Given Eu realizei uma pesquisa de um livro
    When Eu clicar no livro desejado
    And Clicar em adicionar carinho
    Then O sistema deve informar o que o livro foi adicionado 
    And adicionar o livro no carrinho de compras
