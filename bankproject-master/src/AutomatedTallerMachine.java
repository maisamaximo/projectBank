import java.util.Scanner;

public class AutomatedTallerMachine {

    private Banco conta = new Banco();
    private Scanner read = new Scanner(System.in);
    private Operacoes operacoes = new Operacoes();

    //private Money money;

    private Conta currentAccount;
    private boolean continuar = true;
    private int operacao;

   /* public AutomatedTallerMachine(){
        money = new Money(1000);
    }*/

    public void inicial(){
        String userAccountNumber;

        while(true){
            System.out.print("Entre com o número da Conta: ");
            userAccountNumber = read.nextLine();

            if(conta.validateAccountNumber(userAccountNumber)){
                currentAccount = conta.getAccountByNumber(userAccountNumber);

                System.out.println("Caixa Eletrônico v1.0 \n Bem vindo, " + currentAccount.getNomeCorrentista());
                continuar = true;

                while(continuar){
                    showOperations();
                    operacao = read.nextInt();
                    if(operacao != 6) {
                        operacoes.getOperacao(operacao).execute(currentAccount);
                        }
                    else if (operacao == 6){
                        System.exit(0);
                    }
                }
            }
        }
    }
    private void showOperations(){
        System.out.println("\n\t OPERAÇÕES");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("4 - Transferencia");
        System.out.println("5 - Extrato");
        System.out.println("6 - Sair\n");
    }
}

