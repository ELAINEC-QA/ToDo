#language: pt
#encoding: utf8
  Funcionalidade: Lista
    Criar e manter itens em uma lista
  Esquema do Cenario: Incluir itens na lista
    Dado que estou na Lista de Compras
    Quando digito <item> e presssiono  Enter
    Entao exibe o <item> na Lista de Compras

    Exemplos:
      | item |
      |"macarrao"|
      |"molho de tomate"|

    Cenario: Alterar itens na lista
      Dado que estou na Lista de Compras
      Quando clico com o botao direito e clico marcar como concluida
      Entao o intem é alterado para concluido


    Cenario: Excluir itens na lista
      Dado que estou na Lista de Compras
      Quando clico com o botao direito e clico Excluir tarefa e aparece a mensagem Excluir tarefa e clico em Excluir
      Entao o intem é excluido da lista


#todo Alterar Consultar e Excluir







    Exemplos:
      |  |
