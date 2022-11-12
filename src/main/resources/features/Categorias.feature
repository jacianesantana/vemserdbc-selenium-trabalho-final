#language:pt

  @test
  Funcionalidade: Categorias

    Contexto: O usuario deve buscar produtos por categoria e subcategoria

      @wip
      Cenario: Validar botao selecao Categorias com sucesso
        Dado que estou na página Home
        E acesso Categorias
        E clico no botão categoria
        Quando clico no botão subcategoria
        Entao devo ser redirecionado para a tela da subcategoria escolhida