package br.com.stilingue.model;

import br.com.stilingue.constants.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "conversa")
public class ConversaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "data")
    private LocalDate data;
    @Column (name = "mensagem")
    private String mensagem;

//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
    private String status;

    public ConversaEntity() {
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
        ConversaEntity conversa = (ConversaEntity) o;
        return Objects.equals(id, conversa.id) && Objects.equals(data, conversa.data) && Objects.equals(mensagem, conversa.mensagem) && status == conversa.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, mensagem, status);
    }

    @Override
    public String toString() {
        return "ConversaEntity{" +
                "id=" + id +
                ", data=" + data +
                ", mensagem='" + mensagem + '\'' +
                ", status=" + status +
                '}';
    }
}
