package orgMoises._SpringRestAPIFinanceiraDeCredito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Credit;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;
import orgMoises._SpringRestAPIFinanceiraDeCredito.repository.CreditRepository;
import orgMoises._SpringRestAPIFinanceiraDeCredito.repository.CustomerRepository;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
@Service
public class CreditImpl implements CreditService {
    @Autowired
    private CreditRepository creditRepository;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Credit save(Credit credit) {
        Customer customer = customerService.findById(credit.getCostumer().getId());
        if(customer != null) {
            creditRepository.save(credit);
        } else {
           throw new IllegalArgumentException("Customer not found");
        }
        return creditRepository.save(credit);
    }

    @Override
    public List<Credit> findAllByCustomer(Long id) {
        return this.creditRepository.findAllByCustomer(id);
    }

    @Override
    public Credit findByCreditCode(Long id, UUID creditCode) {
        Customer customer = customerService.findById(id);
        if(customer.equals(id) && creditCode != null) {
            creditRepository.findByCreditCode(creditCode);
        } else {
            throw new RuntimeException("CreditCode not found");
        }
        return creditRepository.findByCreditCode(creditCode);
    }
}
