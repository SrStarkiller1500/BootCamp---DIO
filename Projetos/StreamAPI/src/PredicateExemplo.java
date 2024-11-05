import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

    public static void main(String[] args) {
        
        //Criando uma String de palavras
        List <String> palavras = Arrays.asList("JAVA", "JAVASCRIPT","KOTLIN", "PHYTON", "RUBY", "C", "GO");

        //Criando um predicate que verifica se a palvra tem mais de 5 caracteres
        Predicate <String> masiDeCncoCaracteres = palavra -> palavra.length() > 5;

        //Usando o Stream para filtrar palavras com mais de 5 caracteres e em seguida imprimir cada uma que passou no filtro
        palavras.stream()
        .filter (p -> p.length() > 5)
                
        
        .forEach(System.out:: println);

    }

}