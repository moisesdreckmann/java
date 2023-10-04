package orgMoises.desafioJava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import orgMoises.desafioJava.model.Transaction;
import orgMoises.desafioJava.repository.TransactionRepository;
import orgMoises.desafioJava.DTO.TransactionDto;
import orgMoises.desafioJava.model.User;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Transaction createTransaction(TransactionDto transactionDTO) throws Exception {
        User sender = this.userService.findUserById(transactionDTO.senderId());
        User receiver = this.userService.findUserById(transactionDTO.receiverId());

        userService.validateTransaction(sender, transactionDTO.valor());

        boolean isAuthorized = this.autorizacao(sender, transactionDTO.valor());
        if (!isAuthorized) {
            throw new Exception("Transação não autorizada");
        }

        Transaction transaction = new Transaction();
        transaction.setValor(transactionDTO.valor());
        transaction.setSender(sender);
        transaction.setReceiver(receiver);
        transaction.setDate(LocalDate.now());

        sender.setBalance(sender.getBalance().subtract(transactionDTO.valor()));
        receiver.setBalance(receiver.getBalance().add(transactionDTO.valor()));

        this.transactionRepository.save(transaction);
        this.userService.saveUser(sender);
        this.userService.saveUser(receiver);

        return transaction;
    }



    public boolean autorizacao(User sender, BigDecimal valor) {
        ResponseEntity<Map> response = restTemplate.getForEntity("https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6", Map.class);

        if(response.getStatusCode() == HttpStatus.OK && response.getBody().get("message") == "Autorizado") {
            return true;
        } else {
            return false;
        }
    }
}
