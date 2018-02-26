import java.util.Scanner;

public class OperacaoSaque implements InterfaceOperacao{

    private double valor;
    Scanner read = new Scanner(System.in);

    @Override
    public void execute(Conta account) {
        saque();
        if(account.getSaldoAtualizado() >= valor){
        account.decrementaValorConta(valor);
            System.out.println("\n     -----     SAQUE     -----     ");
            System.out.println("______________________     _____________");
            System.out.printf("Valor Saque:                R$%.2f\n", valor);
            System.out.printf("Saldo Atualizado:           R$%.2f\n", account.getSaldoAtualizado());
            System.out.println("______________________     _____________");
            account.addTransacao(new Transacao(valor, "Saque"));
        }else {
            System.out.println("Saldo insuficiente para saque!");
        }

    }

    private double saque(){
        System.out.println("Digite o valor de saque: ");
        valor = read.nextDouble();
        return valor;
    }
}
