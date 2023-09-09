package orgMoises._spring.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import orgMoises._spring.DocProperties.Remetente;

import java.util.List;

@Component
public class Mensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Integer> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefones);
        System.out.println("\n");
        System.out.println(remetente.getEmail());
        System.out.println(remetente.getNome());
        System.out.println(remetente.getEmail());

    }

    //values rodam um valor padrão que se encontram no arquivo app.properties
}
