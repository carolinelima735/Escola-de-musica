package br.com.musica.core;

import br.com.musica.escola.Observador;

public class Aluno extends Pessoa implements Observador {
    private String curso;

    public Aluno(String nome, int idade, String endereco, String curso) {
        super(nome, idade, endereco);
        this.curso = curso;
    }

    public void inscreverCurso(String curso) {
        this.curso = curso;
        System.out.println(getNome() + " foi inscrito no curso: " + curso);
    }

    public void cancelarInscricao() {
        System.out.println(getNome() + " cancelou a inscrição no curso: " + curso);
        this.curso = null;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Aluno " + getNome() + " foi notificado: " + mensagem);
    }
}
