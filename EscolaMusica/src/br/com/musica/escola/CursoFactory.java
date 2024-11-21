package br.com.musica.escola;
//factory responsavel por criar instancias de diferentes tipos de cursos.
public class CursoFactory {
    //cria uma instancia de curso com base no tipo especificado
    public static Curso criarCurso(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo de curso inválido!");
        }

        switch (tipo.toLowerCase()) {
            case "piano":
                return new CursoDePiano();
            case "violao":
                return new CursoDeViolao();
            default:
                throw new IllegalArgumentException("Tipo de curso desconhecido!");
        }
    }
}
