import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    private Conta contaInformada;
    private ArrayList<Conta> accountsList = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public Banco() {
        addAccount(new Conta("54125-9", 10854.78, "João da Silva"));
        addAccount(new Conta("25214-8", 1050.99, "Pedro Otávio Magalhães"));
        addAccount(new Conta("88452-1", 7696., "Maria Green"));
        addAccount(new Conta("15935-7", 412.13, "Stephan Perreira"));
    }

    private void addAccount(Conta account) {
        accountsList.add(account);

    }

    public boolean validateAccountNumber(String accountNumber) {
        for (int i = 0; i < this.accountsList.size(); i++) {
            if (accountNumber.equals(this.accountsList.get(i).getNumeroConta()))
                return true;
        }

        return false;
    }

    public Conta getAccountByNumber(String loginAccountNumber) {
        for (Conta account : accountsList) {
            if (account.getNumeroConta().equals(loginAccountNumber)) {
                return account;
            }
        }
        return null;
    }
}