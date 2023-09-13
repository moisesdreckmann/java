package orgMoises._SpringRestAPIFinanceiraDeCredito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Credit;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Customer;
import orgMoises._SpringRestAPIFinanceiraDeCredito.services.CreditService;
import orgMoises._SpringRestAPIFinanceiraDeCredito.services.CustomerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired //injeção para um atributo. Serve para o spring reconhecer ele
    private CustomerService customerService;

    @PostMapping //adiciona informações no banco
    public ResponseEntity<String> save(Customer customer) {
        Customer savedCustomer = this.customerService.save(customer);
        return ResponseEntity.ok(savedCustomer+ " customer saved with success");
    }

    @GetMapping("/{id}") //pede informações para o banco
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        //Path define que o id vai vir pela url
        return ResponseEntity.ok(this.customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.customerService.delete(id);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) { //passa informações pelo body
        Customer customer1 = this.customerService.findById(customer.getId());
        customer1.setFirstName("novoNome");
        return ResponseEntity.ok(this.customerService.save(customer1));
    }
}
