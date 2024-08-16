package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println(("Número de convidados: " + conjuntoConvidados.contarConvidados()));

        conjuntoConvidados.adicionarConvidado("Pessoa 1", 101);
        conjuntoConvidados.adicionarConvidado("Pessoa 2", 102);
        conjuntoConvidados.adicionarConvidado("Pessoa 3", 102);
        conjuntoConvidados.adicionarConvidado("Pessoa 4", 103);

        conjuntoConvidados.exibirConvidados();

        System.out.println(("Número de convidados: " + conjuntoConvidados.contarConvidados()));

        conjuntoConvidados.removerConvidadoPorCodigoConvite(103);
        System.out.println(("Número de convidados: " + conjuntoConvidados.contarConvidados()));
        conjuntoConvidados.exibirConvidados();
    }

}
