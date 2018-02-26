import java.util.Scanner;

public class OperacaoDeposito implements InterfaceOperacao {

    private double valor;

    Scanner read = new Scanner(System.in);
    private String transferAccountNumber;


    @Override
    public void execute(Conta account) {
        account.confirmaContaTransferir(transferAccountNumber);
        getValordeposito();
        account.decrementaValorConta(valor);
        System.out.println("________ DEPOSITO ________");
        System.out.println("Deposito realizado na conta: " + account.getContaInformada().getNumeroConta());
        System.out.printf("Valor           R$%.2f\n", valor);
        System.out.printf("Novo saldo:     R$%.2f\n", account.getSaldoAtualizado());
        System.out.println("___________________________");
        account.addTransacao(new Transacao(valor, "Deposito"));
    }

    private double getValordeposito(){
        System.out.print("Digite o valor do deposito: ");
        valor = read.nextDouble();
        return valor;
    }

}
