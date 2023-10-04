package orgMoises.desafioJava.DTO;

import orgMoises.desafioJava.model.UserType;

import java.math.BigDecimal;

public record UserDto (String firstName, String lastName, String cpf, String email, String password, BigDecimal balance, UserType usertype){
}
