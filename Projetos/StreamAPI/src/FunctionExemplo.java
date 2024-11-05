import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    

    public static void main(String[] args) {
        
        //Criando uma lista de nueros inteiros
        List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,25);


        //Usando a Fuction com expressão Lambda para dobrar todos os numeros
        Function <Integer, Integer> dobrar = numero -> numero * 2;

        //Usando agora a funciton para dorbrar todos os números no Stream e armazenar em outra lista
        List <Integer> numerosdDobrados = numeros.stream()
        .map (n -> n* 2)
        .toList();

        //Imprimindo a lista com os numeros dobrados
       numerosdDobrados.forEach (System.out:: println); 
    }
}