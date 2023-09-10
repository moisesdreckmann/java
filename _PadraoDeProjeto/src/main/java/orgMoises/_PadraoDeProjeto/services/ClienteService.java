package orgMoises._PadraoDeProjeto.services;
import org.springframework.stereotype.Service;
import orgMoises._PadraoDeProjeto.model.Cliente;

import java.util.Optional;

@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Optional<Cliente> buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
