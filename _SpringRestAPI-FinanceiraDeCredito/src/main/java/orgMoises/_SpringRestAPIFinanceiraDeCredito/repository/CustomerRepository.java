package orgMoises._SpringRestAPIFinanceiraDeCredito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
