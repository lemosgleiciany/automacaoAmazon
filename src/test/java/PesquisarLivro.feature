@tag
Feature: Pesquisar livro
  Eu quero executar uma pesquisa de um determinado livro

  @tag1
  Scenario: Realizar consulta
    Given eu esteja no site da Amazon
    When eu selecionar livro
    And escrever o nome que quero
    And clicar no icone de pesquisa
    Then o sistema devem retornar consulta de acordo com o nome informado
