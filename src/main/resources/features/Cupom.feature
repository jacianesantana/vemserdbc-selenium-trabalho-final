#language:pt

  @test
  Funcionalidade: Cupom

    Contexto: O usuario deve utilizar cupons de desconto pelo site

      @smoke
      Cenario: Validar botão Cupons de Desconto com sucesso
        Dado que estou na página Home
        Quando clico no botão Cupons de Desconto
        Então devo ser redirecionado para a tela de cupons

      @smoke
      Cenario: Validar botão Pegar Cupom com sucesso
        Dado que estou na página Home
        Quando clico no botão Cupons de Desconto
        Quando clico no botão Pegar Cupom
        Então devo visualizar o cupom na tela

      @smoke
      Cenario: Validar botão Copiar e ir para a loja com sucesso
        Dado que estou na página Home
        Quando clico no botão Cupons de Desconto
        Quando clico no botão Pegar Cupom
        Quando clico no botão Ir para a loja
        Então devo ser redirecionado para o site da loja do cupom

      @smoke
      Cenario: Validar botão Search com sucesso
        Dado que estou na página Home
        Quando clico no botão Cupons de Desconto
        E preencho o search com um nome de loja válido
        Quando clico no botão da loja
        Então devo visualizar os cupons desta loja

      @smoke
      Cenario: Validar tentativa botão Search preenchendo campo inválido
        Dado que estou na página Home
        Quando clico no botão Cupons de Desconto
        Quando preencho o search com caracteres inválidos
        Então devo visualizar mensagem de erro 'Ops, não encontramos resultados para a sua pesquisa.'