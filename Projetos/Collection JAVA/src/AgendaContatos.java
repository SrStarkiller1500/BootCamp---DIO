import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
//import java.util.Set;

public class AgendaContatos {
    
    //Atributo
   // private Set <Contato> contatoSet;

    //Atributo MAP
    private Map <String , Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
   }

   public void adicionarContato (String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
   }
   public void removerContato (String nome){
    if (!agendaContatoMap.isEmpty()){
        agendaContatoMap.remove(nome);
    }
}

    public void exibirContatos(){
    System.out.println(agendaContatoMap);
}

public Integer pesquisarPorNome (String nome) {   
    Integer numeroPorNome = null;                                                                                  
    if (!agendaContatoMap.isEmpty()){
        numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
}

public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato ("Carolina", 123456);
    agendaContatos.adicionarContato ("Carolina", 6578963);
    agendaContatos.adicionarContato ("Carolina Silva", 1111111);
    agendaContatos.adicionarContato ("Carolina Outro", 654987);
    agendaContatos.adicionarContato ("Maria Silva", 3165765);


    agendaContatos.exibirContatos();
    
    //agendaContatos.removerContato("Maria Silva");
    //agendaContatos.exibirContatos();


    //System.out.println("O Número é: " + agendaContatos.pesquisarPorNome("Carolina Outro"));
                                            
}

}
   /* VERSÃO SET
   
   public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome , numero));
   }

    public void exibirContatos(){
        System.out.println(contatoSet);
   } 

    public Set <Contato> pesquisarPorNome (String nome){
            Set <Contato> contatosPorNome = new HashSet<>();
            for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
            contatosPorNome.add(c);
           }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome , int novoNumero){
      Contato contatoAtualizado = null;
       for (Contato c : contatoSet){
           if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

   /*
    * public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato ("Carolina", 123456);
        agendaContatos.adicionarContato ("Carolina", 6578963);
        agendaContatos.adicionarContato ("Carolina Silva", 1111111);
        agendaContatos.adicionarContato ("Carolina Outro", 654987);
        agendaContatos.adicionarContato ("Maria Silva", 3165765);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Carolina"));

        System.out.println("Contato atualizado: " +agendaContatos.atualizarNumeroContato("Maria Silva", 55555));

        
    }
    */