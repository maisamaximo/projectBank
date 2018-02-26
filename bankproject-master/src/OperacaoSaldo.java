public class OperacaoSaldo implements InterfaceOperacao{

    @Override
    public void execute(Conta account){
        System.out.println("\n   -----     SALDO ATUAL     -----   " );
        System.out.println("______________________     _____________");
        System.out.println("Correntista:                 " + account.getNomeCorrentista());
        System.out.printf( "Saldo atual:                 R$%.2f\n", account.getSaldoAtualizado());
        System.out.println("_______________________    _____________");
    }
}

