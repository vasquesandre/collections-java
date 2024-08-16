package Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        LocalDate dateAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dateAtual) || entry.getKey().isAfter(dateAtual)) {
                System.out.println("Próximo evento: " + entry.getValue() + "será na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2023, 7, 9), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2023, 6, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2025, 12, 13), "Evento 4", "Atração 4");
        agenda.adicionarEvento(LocalDate.of(2024, 8, 16), "Evento 3", "Atração 3");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }

    

}
