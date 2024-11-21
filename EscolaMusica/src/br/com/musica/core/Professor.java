package br.com.musica.core;

import br.com.musica.escola.Observador;

//  heranca extende atributos e métodos da classe base Pessoa
 //  polimorfismo implementa o método atualizar da interface observer
 // encapsulamento a especialidade é um atributo privado acessado apenas dentro da classe

public class Professor extends Pessoa implements Observador {
    private String especialidade;
// construtor classe professor
    public Professor(String nome, int idade, String endereco, String especialidade) {
        super(nome, idade, endereco);
        this.especialidade = especialidade;
    }
//metodo de agendamento
    public void agendarAula(String aula) {
        System.out.println("Professor " + getNome() + " agendou a aula: " + aula);
    }
//metodo de cancelamento
    public void cancelarAula(String aula) {
        System.out.println("Professor " + getNome() + " cancelou a aula: " + aula);
    }
//observer notifica o professor com mensagem
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Professor " + getNome() + " foi notificado: " + mensagem);
    }
}
