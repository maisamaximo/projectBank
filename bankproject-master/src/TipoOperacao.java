public enum TipoOperacao {

    SALDO(1),
    SAQUE(2),
    DEPOSITO(3),
    TRANSFERENCIA(4),
    EXTRATO(5);

    private int operacao;

    TipoOperacao(int operacao) {
        this.operacao = operacao;
    }

    public int getOperacao(){
        return this.operacao;
    }
}
