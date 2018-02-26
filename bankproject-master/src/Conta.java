import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

    private final String nomeCorrentista;
    private final String numeroConta;
    private final double saldoConta;
    private double valor;
    private Conta contaInformada;
    private ArrayList<Transacao> transacaos = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public Conta(String numeroConta, Double saldoConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.nomeCorrentista = nomeCorrentista;
        valor = saldoConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public double getSaldoAtualizado() {
        return this.valor;
    }

    public void acrescentaValorConta(double valor) {
        this.valor += valor;
    }

    public void decrementaValorConta(double valor) {
        this.valor -= valor;
    }


    //classe transacao?
    public void addTransacao(Transacao transacao){
        transacaos.add(transacao);
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacaos;
    }

    //classe banco?
    public Conta confirmaContaTransferir(String transferAccountNumber) {
        Banco bank = new Banco();

        System.out.print("Entre com um numero de conta Valido: ");
        transferAccountNumber = read.nextLine();

        if (bank.validateAccountNumber(transferAccountNumber)) {
            contaInformada = bank.getAccountByNumber(transferAccountNumber);
        }
        return contaInformada;
    }

    public Conta getContaInformada() {
        return contaInformada;
    }
}


