import java.util.List;

import java.util.stream.Stream;

public class SupplierExemplo {
    
    public static void main(String[] args) {

        //Usando o Supplier com expressão Lambda para uma saudaç~~ao personalizada
        //Supplier <String> saudacao = () -> "Olá, Seja Muito bem Vindo(a)!! ";


        //Usando o Supplier para obter uma lista contendo 5 saudações
        List <String> listaSaudacoes = Stream.generate (() -> "Olá, Seja Muito bem Vindo(a)!! ")
        .limit(5)
        .toList(); //da pra usar so o toList();


        //Imprimindo as saudações que foram geradas
        listaSaudacoes.forEach(s -> System.out.println(s));//da psa usar so o System.out::println
    }
}
