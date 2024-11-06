import java.util.ArrayList;

public class Banco {


    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(String titular) {
        for (Conta conta : contas) {
            if (conta.getTitular().equals(titular)) {
                return conta;
            }
        }
        return null; // Caso não encontre a conta retorna nulo
    }

    public void exibirContas() {
        for (Conta conta : contas) {
            conta.mostrarDetalhes();
        }
    }
}
