package orgMoises._springData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import orgMoises._springData.model.User;
import orgMoises._springData.repository.UserRepository;

@Component
public class StartedApp implements CommandLineRunner {
    @Autowired //injeção de dependencia
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("moises");
        repository.save(user);

        for(User i : repository.findAll()) {
            System.out.println(i);
        }

    }
    //colocar senha do bd em properties
}
