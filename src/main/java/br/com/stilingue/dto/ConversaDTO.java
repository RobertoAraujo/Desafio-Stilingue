package br.com.stilingue.dto;

import br.com.stilingue.constants.Status;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ConversaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private LocalDate data;
    private String mensagem;
    private String status;

    public ConversaDTO(LocalDate data, String mensagem, String status) {
        this.data = data;
        this.mensagem = mensagem;
        this.status = status;
    }

    public ConversaDTO() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversaDTO that = (ConversaDTO) o;
        return Objects.equals(data, that.data) && Objects.equals(mensagem, that.mensagem) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, mensagem, status);
    }

    @Override
    public String toString() {
        return "ConversaDTO{" +
                "data=" + data +
                ", mensagem='" + mensagem + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
