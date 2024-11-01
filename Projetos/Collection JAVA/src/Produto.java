import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto> {

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto (long codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    public long getCodigo(){
        return codigo;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override //verifica se o nome esta igual
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public String toString() {
        return "{"+ nome + " , " + codigo + " , " + preco + " , " + quantidade +"}" ;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public class ComparatorPorPreco implements Comparator <Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco()); //compara por preço
        }
    
        
    }

}