package orgMoises._PadraoDeProjeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import orgMoises._PadraoDeProjeto.model.Cliente;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
