#language: pt
#encoding: utf8
  Funcionalidade: Listas
    Criar e manter listas
    Persona:Thais
    Tipo: Analista Financeiro/ Usuaria frequente

    Cenario: Criar uma lista
    Dado que acesso o site Microsoft To Do
    Quando clico no icone do usuario
    Entao o site realiza o login e exibe a pagina do To Do
      Quando clico em Nova Lista
      E preencho "lista de Compras" e pressiono Enter
      Entao exibe a lista Lista de Compras vazia



    Cenario: Alterar uma lista
      Dado que acesso o site Microsoft To Do
      Quando clico no icone do usuario
      Entao o site realiza o login e exibe a pagina do To Do
      Quando clico lista Lista de Compras com o botao direito
      E clico em renomear lista e reeescrevo Lista de Compras para Casa
      Quando clico em enter
      Entao o nome é alterado



    Cenario: Consultar uma lista
      Dado que acesso o site Microsoft To Do
      Quando clico no icone do usuario
      Entao o site realiza o login e exibe a pagina do To Do
      Quando clico na lista Lista de Compras
      Entao exibe a consultas




    Cenario: Excluir uma lista
      Dado que acesso o site Microsoft To Do
      Quando clico no icone do usuario
      Entao o site realiza o login e exibe a pagina do To Do
      Quando clico na lista Lista de Compras com botao direito
      E aparece a opção excluir lista
      Quando clico no excluir lista
      E aparece uma mensagem Excluir lista "Lista de Compras" será definitivamente excluida
      Quando Clico em Excluir
      Entao a lista é excluida


    Cenario: Compartilhar uma lista
      Dado que acesso o site Microsoft To Do
      Quando clico no icone do usuario
      Entao o site realiza o login e exibe a pagina do To Do
      Quando clico na lista Lista de Compras com botao direito
      E aparece a opção Compartilhar lista
      Quando clico no Compartilhar lista
      E aparece uma mensagem Compartilhar lista
      Quando clica nas pessoas que quer compartilhar
      E Clico em Compartilhar
      Entao a lista é Compartilhada








