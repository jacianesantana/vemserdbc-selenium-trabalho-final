#language:pt

  @test
  Funcionalidade: Entrar

    Contexto: O usuario deve entrar com tentativa de login

      @wip
      Cenario: Validar botao ENTRAR
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        Entao devo ser redirecionado para a página de login

      @wip
      Cenario: Validar cadastro para email nao cadastrado
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        E preencho email valido
        Quando clico no botão de avançar
        Entao devo avançar no cadastro do sistema

      @wip
      Cenario: Validar login com sucesso preenchendo email
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        E preencho email cadastrado
        Quando clico no botão de avançar
        Entao devo ser redirecionado para a página para entrar com o codigo de acesso enviado para o email

      @wip
      Cenario: Validar tentativa de login preenchendo email invalido
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        E preencho email invalido
        Entao não devo avançar no cadastro do sistema

      @wip
      Cenario: Validar tentativa de login sem preencher email
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        E não preencho o campo email
        Entao não devo avançar no cadastro do sistema

      @wip
      Cenario: Validar botao Termos de Uso com sucesso
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        Quando clico no botão Termos de Uso
        Entao devo ser redirecionado para a tela de termos de uso

      @wip
      Cenario: Validar botao Politica de Privacidade com sucesso
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        Quando clico no botão Política de Privacidade
        Entao devo ser redirecionado para a tela de política de privacidade

      @wip
      Cenario: Validar login com sucesso com Facebook
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        Quando clico no boão Continuar com Facebook
        Entao devo ser redirecionado para a página do acesso Facebook

      @wip
      Cenario: Validar login com sucesso com Google
        Dado que estou na página Home
        Quando clico no botão ENTRAR
        Quando clico no boão Continuar com Google
        Entao devo ser redirecionado para a página do acesso Google