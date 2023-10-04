package orgMoises.desafioJava.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

import orgMoises.desafioJava.model.User;
@Entity
@Table(name = "transacoes")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;
    @ManyToOne
    private User sender;
    @ManyToOne
    private User receiver;

    private LocalDate date;

    public Transaction(Long id, BigDecimal valor, User sender, User receiver, LocalDate date) {
        this.id = id;
        this.valor = valor;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
    }

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nTransaction{" +
                "id=" + id +
                ", valor=" + valor +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
