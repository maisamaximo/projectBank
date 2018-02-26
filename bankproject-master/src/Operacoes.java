import java.util.HashMap;
import java.util.Map;

public class Operacoes {
    private Map<Integer, InterfaceOperacao> map = new HashMap<>();
    private TipoOperacao op;

    public Operacoes(){
        map.put(op.SALDO.getOperacao(),         new OperacaoSaldo());
        map.put(op.SAQUE.getOperacao(),         new OperacaoSaque());
        map.put(op.DEPOSITO.getOperacao(),      new OperacaoDeposito());
        map.put(op.TRANSFERENCIA.getOperacao(), new OperacaoTransferencia());
        map.put(op.EXTRATO.getOperacao(),       new OperacaoExtrato());
    }

    public InterfaceOperacao getOperacao(int operacao) {
        return map.get(operacao);
    }

}