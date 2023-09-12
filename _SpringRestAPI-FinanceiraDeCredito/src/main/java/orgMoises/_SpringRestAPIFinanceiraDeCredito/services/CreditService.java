package orgMoises._SpringRestAPIFinanceiraDeCredito.services;

import org.springframework.stereotype.Service;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Credit;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;

import java.util.List;
import java.util.UUID;

@Service
public interface CreditService {
    public Credit save(Credit credit);
    public List<Credit> findAllByCustomer(Long id);
    public Credit findByCreditCode(Long id, UUID creditCode);
}
