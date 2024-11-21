package br.com.musica.main;

import br.com.musica.core.*;
import br.com.musica.escola.*;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstancia(); //Obtém a única instância do Gerenciador de Aulas (Singleton)

        Aluno aluno1 = new Aluno("Caroline", 21, "Taguatinga", "Piano");
        Professor professor1 = new Professor("bruno", 20, "Aguas Claras", "Violão");
        Professor professor2 = new Professor("davi", 20, "Aguas Claras", "Bateria");
//adiciona aluno e professor como observadores do Gerenciador de Aulas (Observer)
        gerenciador.adicionarObservador(aluno1);
        gerenciador.adicionarObservador(professor1);
//notifica os observadores sobre agendamento e cancelamentos das aulas 
        gerenciador.agendarAula("Aula de Piano - 10:00");
        gerenciador.agendarAula("Aula de Violão - 14:00");
         gerenciador.agendarAula("Aula de Bateria - 16:00");
        gerenciador.cancelarAula("Aula de Piano - 10:00");
         
//exibe aulas agendadas
        gerenciador.listarAulas();
// simula inscricao e cancelamento por parte do aluno
        aluno1.inscreverCurso("Violão");
        aluno1.cancelarInscricao();
    }
}
