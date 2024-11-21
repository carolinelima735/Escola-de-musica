package br.com.musica.interfaces;
//interface define o contrato para agendamento e cancelamento de aulas
public interface Agendavel {
    void agendarAula(String aula);
    void cancelarAula(String aula);
}
