#language:pt

@test
Funcionalidade: Search

  Contexto: O usuario deve buscar produtos na aba de pesquisa

  @wip
  Cenario: Validar Search com sucesso preenchendo com nome da categoria
    Dado que estou na página Home
    E preencho campo search com nome de categoria válido
    Quando clico no botão pesquisar
    Então devo visualizar uma lista de produtos desta categoria