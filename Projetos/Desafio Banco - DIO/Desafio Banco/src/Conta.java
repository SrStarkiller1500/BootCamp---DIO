import java.util.ArrayList;

public abstract class Conta {
   private String titular;
    private double saldo;
    private ArrayList<Transacao> extrato; // Lista de transações para a classe de Transação

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Transacao> getExtrato() {
        return extrato;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add(new Transacao(TipoTransacao.DEPOSITO, valor)); // Registra a transação
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!!");
            return true;
        }
        System.out.println("Valor de depósito inválido!!");
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            extrato.add(new Transacao(TipoTransacao.SAQUE, valor)); // Registra a transação
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!!");
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido!!");
        return false;
    }

    public boolean transferencia(Conta destino, double valor) {
        if (saque(valor)) {
            destino.deposito(valor);
            extrato.add(new Transacao(TipoTransacao.TRANSFERENCIA, valor)); // Registra a transação na conta de origem
            destino.getExtrato().add(new Transacao(TipoTransacao.TRANSFERENCIA, valor)); // Registra na conta destino
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!!");
            return true;
        }
        return false;
    }

    public void mostrarDetalhes() {//Método que mostra as informações da conta como o titular (dono) e o saldo remanescente
        System.out.println("Conta " + (this instanceof ContaCorrente ? "Corrente" : "Poupança") +
                " do titular " + titular + " | Saldo: R$ " + saldo);
    }

    // Método para exibir o extrato bancário
    public void exibirExtrato() {
        System.out.println("Extrato da conta de " + titular + ":");
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            for (Transacao transacao : extrato) {
                System.out.println(transacao);
            }
        }
    }
}