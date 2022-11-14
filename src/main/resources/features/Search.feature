#language:pt

  @test
  Funcionalidade: Search

    Contexto: O usuario deve buscar produtos na aba de pesquisa

      @smoke
      Cenario: Validar Search com sucesso preenchendo com nome da categoria
        Dado que estou na página Home
        E preencho campo search com nome de categoria válido
        Quando clico no botão pesquisar
        Entao devo visualizar uma lista de produtos desta categoria

      @smoke
      Cenario: Validar Search com sucesso preenchendo com nome da marca
        Dado que estou na página Home
        E preencho campo search com nome de marca válido
        Quando clico no botão pesquisar
        Entao devo visualizar uma lista de produtos desta marca

      @smoke
      Cenario: Validar Search com sucesso preenchendo com nome da loja
        Dado que estou na página Home
        E preencho campo search com nome de loja válido
        Quando clico no botão pesquisar
        Entao devo visualizar uma lista de produtos desta loja

      @smoke
      Cenario: Validar tentativa de Search preenchendo com nome invalido
        Dado que estou na página Home
        E preencho campo search com caracteres inválidos
        Quando clico no botão pesquisar
        Entao devo visualizar uma mensagem de erro padrão: 'Não encontramos resultados'

      @smoke
      Cenario: Validar tentativa de Search preenchendo com caractere hifen
        Dado que estou na página Home
        E preencho campo search com caractere '-'
        Quando clico no botão pesquisar
        Entao devo visualizar resultado com espaço substituindo o '-'

      @smoke
      Cenario: Validar tentativa de Search sem preencher campo
        Dado que estou na página Home
        E não preencho campo search
        Quando clico no botão pesquisar
        Entao devo visualizar lista de todos os produtos