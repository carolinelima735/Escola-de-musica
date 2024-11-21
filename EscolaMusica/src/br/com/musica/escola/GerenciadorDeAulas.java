package br.com.musica.escola;

import java.util.ArrayList;
import java.util.List;

// Singleton com implementação do padrão Observer
public class GerenciadorDeAulas {
    private static GerenciadorDeAulas instancia;
    private List<String> aulasAgendadas;
    private List<Observador> observadores;

    private GerenciadorDeAulas() {
        aulasAgendadas = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public static GerenciadorDeAulas getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeAulas();
        }
        return instancia;
    }

    public void agendarAula(String aula) {
        if (aula == null || aula.isEmpty()) {
            throw new IllegalArgumentException("Aula inválida!");
        }
        aulasAgendadas.add(aula);
        notificarObservadores("Nova aula agendada: " + aula);
    }

    public void cancelarAula(String aula) {
        if (aulasAgendadas.remove(aula)) {
            notificarObservadores("Aula cancelada: " + aula);
        } else {
            System.out.println("Aula não encontrada para cancelamento.");
        }
    }

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    private void notificarObservadores(String mensagem) {
        for (Observador obs : observadores) {
            obs.atualizar(mensagem);
        }
    }

    public void listarAulas() {
        System.out.println("Aulas agendadas:");
        for (String aula : aulasAgendadas) {
            System.out.println("- " + aula);
        }
    }
}