#language:pt

  @test
  Funcionalidade: Informe Seu CEP

    Contexto: O usuario deve informar seu CEP e visualiza-lo na tela

      @smoke
      Cenario: Validar Informe seu CEP com sucesso preenchendo CEP valido
        Dado que estou na página Home
        E clico no botão Informe seu CEP
        E preencho o campo com CEP válido
        Quando clico no botão Confirmar
        Entao devo visualizar o CEP informado na tela home

      @smoke
      Cenario: Validar tentativa de Informe seu CEP preenchendo campo com CEP invalido
        Dado que estou na página Home
        E clico no botão Informe seu CEP
        E preencho o campo com CEP inválido
        Quando clico no botão Confirmar
        Entao devo receber mensagem de erro padrão 'CEP inválido'

      @smoke
      Cenario: Validar tentativa de Informe seu CEP preenchendo campo com caracteres invalidos
        Dado que estou na página Home
        E clico no botão Informe seu CEP
        E preencho o campo CEP com caracteres inválidos
        Quando clico no botão Confirmar
        Entao devo receber mensagem de erro padrão 'CEP inválido'

      @smoke
      Cenario: Validar tentativa de Informe seu CEP sem preencher campo CEP
        Dado que estou na página Home
        E clico no botão Informe seu CEP
        E não preencho o campo CEP
        Quando clico no botão Confirmar
        Entao devo continuar visualizando Informe seu CEP na tela home
