package br.com.musica.main;

import br.com.musica.core.*;
import br.com.musica.escola.*;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstancia();

        Aluno aluno1 = new Aluno("Caroline", 21, "Taguatinga", "Piano");
        Professor professor1 = new Professor("bruno", 20, "Aguas Claras", "Violão");

        gerenciador.adicionarObservador(aluno1);
        gerenciador.adicionarObservador(professor1);

        gerenciador.agendarAula("Aula de Piano - 10:00");
        gerenciador.agendarAula("Aula de Violão - 14:00");
        gerenciador.cancelarAula("Aula de Piano - 10:00");

        gerenciador.listarAulas();

        aluno1.inscreverCurso("Violão");
        aluno1.cancelarInscricao();
    }
}