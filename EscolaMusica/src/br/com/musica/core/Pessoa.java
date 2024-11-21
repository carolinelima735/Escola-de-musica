package br.com.musica.core;
 //abstracao: classe base que nao sera instanciada diretamente servindo como modelo para classes derivadas (aluno professor)
// encapsulamento: os atributos sao privados e acessados apenas por métodos publicos

//construtor da classe pessoa
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }
}
