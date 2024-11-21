package br.com.musica.escola;
// abstracao: serve como modelo para especializacoes como CursoDePiano ou CursoDeViolao.
 // - encapsulamento: atributo privado "nome" acessado e modificado por metodos publicos.

//Classe base para os cursos
public abstract class Curso {
 private String nome;
//retorna ao nome do curso
 public Curso(String nome) {
     this.nome = nome;
 }
//define o nome do curso
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }
//exibe detalhes sobre o curso
 public void detalhes() {
     System.out.println("Curso: " + nome);
 }
}
