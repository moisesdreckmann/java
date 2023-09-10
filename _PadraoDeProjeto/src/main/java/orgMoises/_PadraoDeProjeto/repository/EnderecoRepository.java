package orgMoises._PadraoDeProjeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import orgMoises._PadraoDeProjeto.model.Endereco;
import java.util.Optional;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    Optional<Endereco> findByCep(String cep);
}
