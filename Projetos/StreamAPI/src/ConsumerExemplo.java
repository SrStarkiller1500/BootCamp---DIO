import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {



    public static void main(String[] args) {
       //Criando uma lista com números inteiros
       List <Integer> numeros = Arrays.asList(1, 2 , 3 , 4 ,5,6,7,8,9,10,11,12,13,14,15);

       //Usando aqui o Consumer com uma expressão Lambda para imprimir os números pares
       Consumer <Integer> imprimirNumeroPar = numero ->{
        if (numero % 2 == 0 ){
            System.out.println(numero);
        }
       };


       //Agora o consumer para imprimir números pares no Stream
       numeros.stream().forEach(imprimirNumeroPar);
    }
}