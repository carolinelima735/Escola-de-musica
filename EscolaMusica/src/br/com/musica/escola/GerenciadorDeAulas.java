package br.com.musica.escola;

import java.util.ArrayList;
import java.util.List;

// Singleton com implementação do padrão Observer
public class GerenciadorDeAulas {
    private static GerenciadorDeAulas instancia;
    private List<String> aulasAgendadas;
    private List<Observador> observadores;
//construtor privado para garantir que a classe siga o padrão Singleton.
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
//agenda aula e notifica os observadores
    public void agendarAula(String aula) {
        if (aula == null || aula.isEmpty()) {
            throw new IllegalArgumentException("Aula inválida!");
        }
        aulasAgendadas.add(aula);
        notificarObservadores("Nova aula agendada: " + aula);
    }
// cancela aula e notifica os observadores
    public void cancelarAula(String aula) {
        if (aulasAgendadas.remove(aula)) {
            notificarObservadores("Aula cancelada: " + aula);
        } else {
            System.out.println("Aula não encontrada para cancelamento.");
        }
    }
// adiciona o observer na lista de notificacoes
    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }
// notifica sobre alguma mudanca
    private void notificarObservadores(String mensagem) {
        for (Observador obs : observadores) {
            obs.atualizar(mensagem);
        }
    }
// lista as aulas agendadas 
    public void listarAulas() {
        System.out.println("Aulas agendadas:");
        for (String aula : aulasAgendadas) {
            System.out.println("- " + aula);
        }
    }
}
