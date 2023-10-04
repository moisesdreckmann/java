package orgMoises.desafioJava.DTO;

import java.math.BigDecimal;

public record TransactionDto(BigDecimal valor, Long senderId, Long receiverId) {

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public Long senderId() {
        return senderId;
    }

    @Override
    public Long receiverId() {
        return receiverId;
    }

    public TransactionDto {
    }


}
