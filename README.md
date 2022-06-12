# POO2_ExercicioFinal
*Exercício final do módulo 3 (PROGRAMAÇÃO ORIENTADA A OBJETOS II) - Tomorrow Tech Talents.*

## Exercício de Sistema de Livraria
O intuito do exercício a seguir é treinar e fixar os conceitos de SRP e OCP do SOLID.
Neste exercício deve se implementar o sistema de uma livraria e depois algumas mudanças de escopo serão aplicadas.

## Solução do exercício
O enunciado no exercício está contido na pasta src/documents. O exercício é composta de duas partes. Na primeria pede-se a implementação de um sistema de gerenciamento de items de uma livraria e um caixa para efetuar compras. Na segunda parte é pedido algumas alterações no sistema a fim de se validar a aplicação dos conceitos "Single Responsibility" e "Open-Closed" do SOLID. 

Na primeira parte foram implementadas as classes que representam os itens do estoque, o gerenciador de itens, o estoque, o gerenciador de estoque, o caixa e os suas respectivas interfaces. Na segunda parte é pedido para indicar se os produtos do estoque podem ou não ser vendidos para menores de idade, para isso é necessário validar os dados do cliente, e também implementar um desconto caso o cliente compre determiado valor em livros.

A relacionamento entres as classes se dá conforme o diagrama de classes a baixo: 
