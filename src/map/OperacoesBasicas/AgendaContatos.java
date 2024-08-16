package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()) {
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;
        
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Andre", 12345);
        agenda.adicionarContato("Andre", 67890);
        agenda.adicionarContato("Andre Vasques", 11111);
        agenda.adicionarContato("Nicole", 12345);
        agenda.adicionarContato("Andre", 4444);

        agenda.exibirContatos();

        agenda.removerContato("Andre");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Nicole"));
    }

    

}
