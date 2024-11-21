package br.com.musica.escola;

//Classe base para os cursos
public abstract class Curso {
 private String nome;

 public Curso(String nome) {
     this.nome = nome;
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public void detalhes() {
     System.out.println("Curso: " + nome);
 }
}