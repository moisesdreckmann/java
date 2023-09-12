package orgMoises._SpringRestAPIFinanceiraDeCredito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;
import orgMoises._SpringRestAPIFinanceiraDeCredito.repository.CustomerRepository;

@Service
public class CustomerImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return this.customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id+" not found"));
    }

    @Override
    public String delete(Long id) {
        if (this.customerRepository.existsById(id)) {
            this.customerRepository.deleteById(id);
            return "ID " + id + " was deleted";
        } else {
            return "ID " + id + " not found";
        }
    }
}
