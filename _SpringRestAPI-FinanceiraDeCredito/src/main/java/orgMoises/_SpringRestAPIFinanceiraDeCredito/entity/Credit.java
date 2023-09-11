package orgMoises._SpringRestAPIFinanceiraDeCredito.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "Credito")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private UUID creditCode = UUID.randomUUID();
    @Column(nullable = false, length = 50)
    private BigDecimal creditValue = BigDecimal.ZERO;
    @Column(nullable = false, length = 10)
    private LocalDate dayFirstInstallment;
    @Column(nullable = false)
    private int numberInstallment = 0;
    @Column(nullable = false)
    private int status = 1;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "credits")
    private Customer customer;

    public Credit(Long id, UUID creditCode, BigDecimal creditValue, LocalDate dayFirstInstallment, int numberInstallment, int status, Customer customer) {
        this.id = id;
        this.creditCode = creditCode;
        this.creditValue = creditValue;
        this.dayFirstInstallment = dayFirstInstallment;
        this.numberInstallment = numberInstallment;
        this.status = status;
        this.customer = customer;
    }

    public Credit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(UUID creditCode) {
        this.creditCode = creditCode;
    }

    public BigDecimal getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(BigDecimal creditValue) {
        this.creditValue = creditValue;
    }

    public LocalDate getDayFirstInstallment() {
        return dayFirstInstallment;
    }

    public void setDayFirstInstallment(LocalDate dayFirstInstallment) {
        this.dayFirstInstallment = dayFirstInstallment;
    }

    public int getNumberInstallment() {
        return numberInstallment;
    }

    public void setNumberInstallment(int numberInstallment) {
        this.numberInstallment = numberInstallment;
    }

    public int getStatus() {
        return status;
    }

    public String setStatus(int status) {
        if(status == 1) {
            return "o credito está processando...";
        } else if (status == 2) {
            return "o credito foi aprovado!";
        } else {
            return "o credito foi rejeitado :(";
        }
    }

    public Customer getCostumer() {
        return customer;
    }

    public void setCostumer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "\nCredit{" +
                "id=" + id +
                ", creditCode=" + creditCode +
                ", creditValue=" + creditValue +
                ", dayFirstInstallment=" + dayFirstInstallment +
                ", numberInstallment=" + numberInstallment +
                ", status=" + status +
                ", costumer=" + customer +
                '}';
    }
}
