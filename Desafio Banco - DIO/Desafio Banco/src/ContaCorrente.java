public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Conta Corrente do titular " + getTitular() + " | Saldo: R$ " + getSaldo());
    }
}