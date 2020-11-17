#language: pt
#encoding: utf8
Funcionalidade: Usuario
  Criar , manter e autenticar usuarios


  Cenario: Login com sucesso
    Dado que estou em Microsoft To Do e deslogado
    Quando clico no icone para realizar o login
    Entao exibe a pagina de login
    Quando preencho o email"correia" e clico em Proximo
    E seleciona a conta pessoal
    E digita a senha "teste123" e clico em Entrar
    Entao o site realiza o login e exibe a pagina do To Do


Cenario: Login Incorreto
  Cenario: Login com sucesso
    Dado que estou em Microsoft To Do e deslogado
    Quando clico no icone para realizar o login
    Entao exibe a pagina de login
    Quando preencho o email"correia" e clico em Proximo
    E seleciona a conta pessoal
    E digita a senha "pop123" e clico em Entrar
    Entao o site exibe a mensagem de erro



  Cenario: Esqueci a senha
    Dado que estou em Microsoft To Do e deslogado
    Quando clico no icone para realizar o login
    Entao exibe a pagina de login
    Quando preencho o email"correia" e clico em Proximo
    E seleciona a conta pessoal
    E digita a senha "pop123" e clico em Entrar
    Entao o site exibe a mensagem de erro e clico em esqueci minha senha
    E prencho o email para que enviei a senha correta para la


Cenario : Incluir usuario
  Dado que estou em Microsoft To Do e deslogado
  Quando clico no icone para realizar o login
  Entao exibe a pagina de login e clico em Crie uma! e a mensagem Criar conta aprece
  Quando preencho com o email "cardosoe66@gmail.com" e e clico no proximo e cadstro a senha ¨test123"
  E clico em salvar
  Entao inclui o usuario