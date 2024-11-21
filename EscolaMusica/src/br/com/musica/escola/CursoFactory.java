package br.com.musica.escola;

public class CursoFactory {
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