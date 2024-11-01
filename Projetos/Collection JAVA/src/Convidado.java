public class Convidado {
    private String nome;
    private int codigoConvite;

    //Métodos
    public Convidado (String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    public String getNome(){
        return nome;
    }

    public int getcodigoConvite(){
        return codigoConvite;
    }

    public String toString(){
        return nome;
    }
}