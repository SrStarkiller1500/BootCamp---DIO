import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOpertionExemplo {
    

    public static void main(String[] args) {
        
         //Criando uma lista com números inteiros
       List <Integer> numeros = Arrays.asList(1, 2 , 3 , 4 ,5,6,7,8,9,10,11,12,13,14,15);

       //Usando o BinaryOperator com expressão lambda para somar os dois numeros
       BinaryOperator <Integer> somar = (n1 , n2) -> n1 + n2;


       //Agora usando para somar todos os números no STream
       int resultado = numeros.stream()
       .reduce (0, Integer::sum);


       //Imprimindo o resultado
       System.out.println("A Soma dos Números é " + resultado);
    }
}