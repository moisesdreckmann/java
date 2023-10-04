package orgMoises.desafioJava.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orgMoises.desafioJava.model.Transaction;
import orgMoises.desafioJava.services.UserService;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
