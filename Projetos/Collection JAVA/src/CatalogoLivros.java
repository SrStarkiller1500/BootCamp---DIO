import java.util.ArrayList;
import java.util.List;

import javax.xml.catalog.CatalogResolver;

public class CatalogoLivros {

    private List <Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){ 
        List <Livro> livrosPorAutor = new ArrayList<>();

        if (livroList.isEmpty()){
           for(Livro l: livroList)
           if (l.getAutor().equalsIgnoreCase(autor))
            livrosPorAutor.add(l);
           }

           return livrosPorAutor;
        }

        public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List <Livro> livrosPorIntervaloAnos = new ArrayList<>();
    
            if (livroList.isEmpty()){
               for(Livro l: livroList)
               if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(l);
               }
            }
            return livrosPorIntervaloAnos;
        }
            public Livro pesquisarPorTitulo (String titulo){
            Livro livroPorTiulo = null;
            
            if (livroList.isEmpty()){
                for(Livro l: livroList){
                    if (((String) l.getTitulo).equalsIgnoreCase(titulo)){
                        livroPorTiulo = l;
                    }
                }
            }
            return livroPorTiulo;
            }
            

        public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();
            
            
            
            
            System.out.println(catalogoLivros.pesquisarPorAutor(null));
            System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(null));
            System.out.println(catalogoLivros.pesquisarPorTitulo(null));
        }

}