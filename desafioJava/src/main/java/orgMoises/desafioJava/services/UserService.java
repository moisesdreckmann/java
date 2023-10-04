package orgMoises.desafioJava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orgMoises.desafioJava.DTO.UserDto;
import orgMoises.desafioJava.model.UserType;
import orgMoises.desafioJava.repository.UserRepository;
import orgMoises.desafioJava.model.User;
import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal valor) throws Exception{
        if(sender.getUsertype() == UserType.LOGISTA) {
            throw new Exception("logistas não podem realizar pagamentos");
        }

        if(sender.getBalance().compareTo(valor) < 0) {
            throw new Exception("saldo insuficiente");
        }

    }

    public User findUserById(Long id) throws Exception {
        return this.userRepository.findUserById(id)
                .orElseThrow(() -> new Exception("usuario não encontrado"));
    }

    public void saveUser(User user) {
        this.userRepository.save(user);
    }

    public User createUser(UserDto data) {
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

}
