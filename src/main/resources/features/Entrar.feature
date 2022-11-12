#language:pt

@test
Funcionalidade: Entrar

  Contexto: O usuario deve entrar com tentativa de login

  @wip
  Cenario: Validar botão "ENTRAR"
    Dado que estou na página Home
    Quando clico no botão ENTRAR
    Então devo ser redirecionado para a página de login

  @wip
  Cenario: Validar cadastro para email não cadastrado
    Dado que estou na página Home
    Quando clico no botão ENTRAR
    E preencho email valido
    Quando clico no botão de avançar
    Então devo avançar no cadastro do sistema

  @wip
  Cenario: Validar login com sucesso preenchendo email
    Dado que estou na página Home
    Quando clico no botão ENTRAR
    E preencho email cadastrado
    Quando clico no botão de avançar
    Então devo ser redirecionado para a página para entrar com o codigo de acesso enviado para o email

  @wip
  Cenario: Validar tentativa de login preenchendo email inválido
    Dado que estou na página Home
    Quando clico no botão ENTRAR
    E preencho email invalido
    Então não devo avançar no cadastro do sistema