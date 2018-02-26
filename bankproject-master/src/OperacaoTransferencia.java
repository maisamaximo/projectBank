import java.util.Scanner;

public class OperacaoTransferencia implements InterfaceOperacao {

    Scanner read = new Scanner(System.in);
    private double valor;
    private String transferAccountNumber;

    @Override
    public void execute(Conta account) {
        account.confirmaContaTransferir(transferAccountNumber);
        getValorTransfere();
        if(account.getSaldoAtualizado() >= valor){
            account.decrementaValorConta(valor);
            account.getContaInformada().acrescentaValorConta(valor);

            System.out.println("___________ TRANSFERENCIA ___________");
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Transferencia para:       " + account.getContaInformada().getNomeCorrentista()
                    + "\nConta                     " + account.getContaInformada().getNumeroConta()
                    + "\nValor de                  R$" + valor);
            System.out.printf(" Seu saldo atual é de: R$%.2f\n", account.getSaldoAtualizado());
            System.out.println("_____________________________________");
            account.addTransacao(new Transacao(valor, "Transferencia"));
        }else {
            System.out.println("Saldo insuficiente para transferência!");
        }

    }

    private double getValorTransfere() {
        System.out.print("Digite valor para transferencia: ");
        valor = read.nextDouble();
        return valor;
    }




}

