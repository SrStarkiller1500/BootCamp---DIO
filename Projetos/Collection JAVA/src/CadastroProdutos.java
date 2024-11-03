import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set <Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet= new HashSet<>();
    }

    public void adiconarProduto (long cod , String nome , double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome, preco, quantidade ));
    }
    

    public Set <Produto> exibirProdutosPorNome(){
        Set <Produto> produtosPorNome = new TreeSet<>(produtoSet);//TreeSet organiza
        return produtosPorNome;
    }

    public Set <Produto> exibirProdutosPorPreco(){
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());//TreeSet organiza
      produtoSet.addAll(produtoSet);
      return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    }
}