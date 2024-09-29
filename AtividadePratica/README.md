## Breve descrição do Sistema

Este código apresenta um sistema simples de gerenciar informações de pessoas e consiste em três classes: _pessoa, Gerenciameto de pessoas, Main._

## Informações de compilação e execução
Execute o comando java seguido pelo nome da classe principal *main*, assim o programa exibirá  as informações das pessoas cadastradadas e atualizadas.

## Exemplo de uso
           *Saída*
Nome: xxxxx Cpf: xxxxx Idade: xx
Informações da pessoa1
Nome: xxxxxxxxxxx
CPF: xxxxxxxx
Idade: xx
Informações da pessoa2
Nome: xxxxxx
CPF: xxxx
Idade: xx

Informações da Pessoa1 (atualizadas):
Nome: xxxxxxxx
CPF: xxxxx
Idade: xx


## Explicação de como a lógica de encapsulamento foi aplicado no sistema

Os atributos nome, cpf e idade são declarado como privado, sendo que só pode ser acessados dentro da própria classe pessoa.
A classe pessoa fornece métodos públicos e através do método getter se consegue obter o valor de um atributo privado, enquanto os métodos setters são usados para modificar o valor de um atributo.
Assim o encapsulamento protege os dados do objeto de acesso e modificação indevidos. Além de permitir que você controle como os dados são acessados e modificados. 

