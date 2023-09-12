package orgMoises._SpringRestAPIFinanceiraDeCredito.services;

import org.springframework.stereotype.Service;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;

@Service
public interface CustomerService {
    public Customer save(Customer customer);
    public Customer findById(Long id);
    public String delete(Long id);
}
