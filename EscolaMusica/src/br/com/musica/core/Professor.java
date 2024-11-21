package br.com.musica.core;

import br.com.musica.escola.Observador;

public class Professor extends Pessoa implements Observador {
    private String especialidade;

    public Professor(String nome, int idade, String endereco, String especialidade) {
        super(nome, idade, endereco);
        this.especialidade = especialidade;
    }

    public void agendarAula(String aula) {
        System.out.println("Professor " + getNome() + " agendou a aula: " + aula);
    }

    public void cancelarAula(String aula) {
        System.out.println("Professor " + getNome() + " cancelou a aula: " + aula);
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Professor " + getNome() + " foi notificado: " + mensagem);
    }
}
