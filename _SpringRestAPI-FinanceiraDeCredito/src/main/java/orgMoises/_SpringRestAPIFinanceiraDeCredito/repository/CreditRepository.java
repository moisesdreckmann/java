package orgMoises._SpringRestAPIFinanceiraDeCredito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Credit;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;

import java.util.List;
import java.util.UUID;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
    public Credit findByCreditCode(UUID creditCode);
    @Query(value = "SELECT * FROM Credito WHERE Credito_id = ?1", nativeQuery = true)
    public List<Credit> findAllByCustomer(Long id);
}

