package orgMoises._springWebAPIRest.repository;

import org.springframework.stereotype.Repository;
import orgMoises._springWebAPIRest.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getId() == null) {
            System.out.println("SAVE - Usuario.id == null");
        } else {
            System.out.println("UPDATE - Usuario.id != null");
        }
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETA usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LISTANDO os usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "moises1", "password"));
        usuarios.add(new Usuario(2, "moises2", "password"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("Encontra usuario pelo ID",id));
        System.out.println(id);
        return new Usuario(1,"moises1","password");
    }
}
