public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Conta Poupança do titular " + getTitular() + " | Saldo: R$ " + getSaldo());
    }
}