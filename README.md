# projectBank
Exercícios

Este exercício diz respeito à modelagem de um caixa eletrônico. Ao iniciar o programa, deve ser exibida a opção para o usuário fornecer somente o número da conta:

Conta:

Após o fornecimento de um número de conta válido, devem ser exibidas as seguintes opções:

Caixa Eletrônico v1.0

1. Saldo

2. Saque (notas disponíveis: <exibir aqui as notas disponíveis>)

3. Depósito

4. Transferência

5. Extrato

6. Sair

Para simplificação, crie um value object (i.e., um objeto que tem sentido em um domínio, como definido no livro Domain-Driven Design—Tackling Complexity in the Heart of Software, p.97) e é imutável, como definido no livro Java Concurrency in Practice, p. 38, ou no livro Effective Java, 2nd ed., item 15, p. 73) chamado Money e inicie o caixa eletrônico com R$1.000 no método construtor, com notas de R$100, R$50, R$20 e R$10 (as quantidades não importam, mas que o valor total seja R$1.000 e que haja pelo menos uma nota de cada valor).

Além disso, deve haver também 4 contas disponíveis (não precisam ser criadas novas contas). As contas e os respectivos saldos são as seguintes:

João da Silva – 54125-9 – R$ 10.854,78

Pedro Otávio Magalhães – 25214-8 – R$1.050,99

Maria Green – 88452-1 – R$ 7.696,00

Stephan Pereira – 15935-7 – R$ 412,13

Para simplificação, cada correntista tem somente uma conta corrente (não é necessário modelar investimentos).

Na opção 1, deve ser exibido somente o saldo do correntista. Por exemplo, se o correntista João da Silva não recebeu nenhum depósito e não fez nenhum saque, deve ser exibido R$10.854,78.

Na opção 2, o console deve permitir que o usuário forneça o valor a ser sacado. O valor deve ser debitado da conta do usuário e o saldo disponível para o correntista deve ser atualizado. O correntista não pode tirar mais dinheiro do que há disponível na sua conta. Além disso, deve ser verificado se ainda há no caixa eletrônico a quantidade disponível para saque.

Na opção 3, o console deve permitir que o usuário forneça o valor a ser depositado e a conta destino. O valor deve ser somado à conta do correntista. Caso o usuário forneça um número de conta inválido, deve ser exibido no console “Conta inválida” e novamente a opção para o usuário fornecer o valor e a conta destino. As notas disponíveis no caixa eletrônico também devem ser atualizadas.

Na opção 4, o correntista transfere dinheiro de sua conta para outra conta. O correntista não pode transferir mais dinheiro do que há disponível na sua conta, e a conta destino deve ser uma conta válida. Neste caso, os valores disponíveis no caixa eletrônico não são alterados.

Na opção 5, deve ser exibido o extrato de transações do correntista. Cada movimentação na sua conta (tanto saque quanto depósito recebido) deve constar neste extrato. Não é necessário persistir as transações entre as execuções do programa.

A opção 6 simplesmente sai da aplicação.

Após o desenvolvimento, avalie quanto trabalho você teria para migrar o código da tela baseada em console para um código que utilize Java Swing.

Antes de iniciar o desenvolvimento, crie um diagrama de classes que especifique seu design. O diagrama não deve ser completo, mas deve organizar o raciocínio para o início do desenvolvimento.

Os conceitos a serem exercitados são os seguintes:

· Encapsulamento

· Ortogonalidade

· Design by Contract (pre/post conditions e class invariants)

· Tell Don’t Ask

· Law of Demeter (principle of least knowledge)

· Domain-Driven Design:

o Layered architecture (presentation, application, domain and infrastructure) – architectural style

o Rich domain models (entities and value objects) vs. Anemic domain models

o Domain events

· MVC (architectural pattern)

· Event sourcing (architectural pattern)

· UML
