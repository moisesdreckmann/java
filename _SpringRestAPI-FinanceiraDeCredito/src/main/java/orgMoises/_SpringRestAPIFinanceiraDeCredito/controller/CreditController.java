package orgMoises._SpringRestAPIFinanceiraDeCredito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import orgMoises._SpringRestAPIFinanceiraDeCredito.entity.Credit;
import orgMoises._SpringRestAPIFinanceiraDeCredito.services.CreditService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/credits")
public class CreditController {
    @Autowired
    private CreditService creditService;


    @PostMapping //adiciona informações no banco
    public ResponseEntity<String> saveCredit(Credit credit) {
        Credit savedCredit = this.creditService.save(credit);
        return ResponseEntity.ok(savedCredit+ " credit saved with success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Credit>> findAllByCustomerId(@PathVariable Long id) {
        return ResponseEntity.ok(this.creditService.findAllByCustomer(id));
    }

    @GetMapping("/creditCode/{id}")
    public ResponseEntity<Credit> findByCreditCode(@PathVariable Long id, @RequestParam(value = "creditCode") UUID creditCode) {
        return ResponseEntity.ok(this.creditService.findByCreditCode(id, creditCode));
    }

}
