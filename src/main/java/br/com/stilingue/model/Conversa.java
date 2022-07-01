package br.com.stilingue.model;

import br.com.stilingue.constants.Status;
import java.time.LocalDate;

public class Conversa {

    private Long id;
    private LocalDate data;
    private String mensagem;
    private Status status;

    public Conversa() {
    }
}
