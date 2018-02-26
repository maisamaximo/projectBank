public class OperacaoExtrato implements InterfaceOperacao{

    @Override
    public void execute(Conta account) {
        System.out.println("\n     -----     EXTRATO     -----     ");
        System.out.println("______________________     _____________");
        System.out.println("Correntista:                " + account.getNomeCorrentista());
        System.out.printf("Número da conta:             " + account.getNumeroConta());
        System.out.printf("\nSaldo anterior:              R$ %.2f\n", account.getSaldoConta());
        System.out.printf("Saldo atual:                 R$ %.2f\n", account.getSaldoAtualizado());
        System.out.println("\nOperações Realizadas ___________________");
        account.getTransacoes().forEach(transacao -> System.out.print(transacao));
        System.out.println("\n_______________________    _____________");
    }
}
