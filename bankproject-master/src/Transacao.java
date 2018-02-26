import java.util.ArrayList;

public class Transacao {


    private String titulo;
    private double valor;

    public Transacao(double valor, String titulo){
            this.titulo = titulo;
            this.valor = valor;
    }

    //enum tipo operacao
    public String toString(){
        return String.format("\n -  %s no valor de R$ %.2f", this.titulo, this.valor);
    }
}
