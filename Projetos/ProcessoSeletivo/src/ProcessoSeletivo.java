import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        System.out.println("Processo Seletivo!");
        
        // chamando o metodo 
        selecaoCandidatos();
        imprimeOsSelecionados();

        String [] candidatos = {"FELIPE", "JOAO", "CARLOS", "MARCIO","LUCAS", "KARLA", "ALINE", "PAULA", "MICHELE", "KELLY"};
        for(String candidato:  candidatos){
            entrandoEmContato(candidato);
        }
    }

    //método para entrar em contato

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando= true ;
        boolean atendeu = false;
        do{ //lógica para se o candidato atebndeu ou não
            atendeu = atender();
            continuarTentando=!atendeu;

            if (continuarTentando)
            tentativasRealizadas++;
            else System.err.println("Realizado Contato com Sucesso!");

        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu)
        System.err.println("CONSEGUIMOS O CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
        System.err.println("NÃO CONSEGUIMOS O CONTATO COM " + candidato + " , NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
    }  

    //método de auxilio para o atendimento dos candidatos
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimeOsSelecionados(){
        String [] candidatos = {"FELIPE", "JOAO", "CARLOS", "MARCIO","LUCAS", "KARLA", "ALINE", "PAULA", "MICHELE", "KELLY"};
        //System.out.println("Impressão da Lista de Candidatos Selecionados a partir do indice");

       /* for (int indice=0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
            
            }*/ 

        //listando com o foreach e abreviando
        //System.out.println();
        for(String candidato:  candidatos){
            System.out.println("O Candidato selecionado foi: " + candidato);

        }
    }
    
    //Abaixo o metdodo de seleção
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "JOAO", "CARLOS", "MARCIO","LUCAS", "KARLA", "ALINE", "PAULA", "MICHELE", "KELLY" };// arra com os candidatos

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){//contando a quantidade
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido ();

            System.out.println("O Candidato " + candidato + " Solciitou o seguinte valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.err.println("O Candidtato " + candidato + "  foi selecionado!");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800 , 2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar Para o Candidato");
        } else if (salarioBase == salarioPretendido)
        System.out.println("Ligar para o candidato com contraproposta");

            else{
        System.out.println("Aguardando o Resultados dos demais candidatos");
    }

    }
}