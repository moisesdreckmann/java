package orgMoises._springWebAPIRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import orgMoises._springWebAPIRest.model.Usuario;
import orgMoises._springWebAPIRest.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/usersList")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/searchusers/{id}")
    public Usuario getOne(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/postUser")
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
