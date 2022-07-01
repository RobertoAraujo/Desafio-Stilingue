package br.com.stilingue.model;

import br.com.stilingue.constants.Status;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Conversa  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private LocalDate data;
    private String mensagem;
    private Status status;

    public Conversa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversa conversa = (Conversa) o;
        return Objects.equals(id, conversa.id) && Objects.equals(data, conversa.data) && Objects.equals(mensagem, conversa.mensagem) && status == conversa.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, mensagem, status);
    }

    @Override
    public String toString() {
        return "Conversa{" +
                "id=" + id +
                ", data=" + data +
                ", mensagem='" + mensagem + '\'' +
                ", status=" + status +
                '}';
    }
}
