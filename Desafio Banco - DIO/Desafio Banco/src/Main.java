public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando contas
        Conta corrente = new ContaCorrente("Carlos", 1000.00);
        Conta poupanca = new ContaPoupanca("Melissa", 500.00);

        banco.adicionarConta(corrente);
        banco.adicionarConta(poupanca);

        // Realizando operações
        corrente.deposito(500.00); // Carlos deposita
        poupanca.saque(100.00); // Melissa saca

        // Transferência entre contas
        corrente.transferencia(poupanca, 200.00); // Carlos transfere para Melissa

       // Aqui exibe os detalhes das contas e extrato
       banco.exibirContas();
        
       System.out.println();
       corrente.exibirExtrato();  // Exibe o extrato da conta de Carlos
       System.out.println();
       poupanca.exibirExtrato();  // Exibe o extrato da conta de Melissa
    }
}