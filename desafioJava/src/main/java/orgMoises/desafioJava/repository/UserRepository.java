package orgMoises.desafioJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orgMoises.desafioJava.model.User;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserByCpf(String cpf);
   Optional<User> findUserById(Long id);
}
