import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set <Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet= new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c: convidadoSet){
            if (c.getcodigoConvite() == codigoConvite){
                convidadoParaRemover= c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibiConvidados (){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro do set de Convidados");

    }
}