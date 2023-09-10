package orgMoises._PadraoDeProjeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orgMoises._PadraoDeProjeto.model.Cliente;
import orgMoises._PadraoDeProjeto.model.Endereco;
import orgMoises._PadraoDeProjeto.repository.ClienteRepository;
import orgMoises._PadraoDeProjeto.repository.EnderecoRepository;

import java.util.Optional;
@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        String cep = cliente.getEndereço().getCep();
        Endereco endereco = enderecoRepository.findByCep(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereço(endereco);
        clienteRepository.save(cliente);
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clientebd = clienteRepository.findById(id);
        if(clientebd.isPresent()) {
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
