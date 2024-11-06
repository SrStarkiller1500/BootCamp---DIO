import java.time.LocalDateTime;

 /*
    
   Essa classe Transacao vai armazenar os detalhes de cada operação, como tipo de transação, valor e data.
    
    */
   
public class Transacao {
    private TipoTransacao tipo;
    private double valor;
    private LocalDateTime data;

    public Transacao(TipoTransacao tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();  // Data e hora atual
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Valor: R$ " + valor + ", Data: " + data;
    }

}