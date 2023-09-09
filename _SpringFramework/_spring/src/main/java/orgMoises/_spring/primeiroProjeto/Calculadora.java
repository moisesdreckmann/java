package orgMoises._spring.primeiroProjeto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component //component para codigo interno, beans para codigo externo http
public class Calculadora implements CommandLineRunner {
    //o implements cria uma instancia do objeto
    public int somar(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(somar(5,3));
        System.out.println(somar(5,6));
    }

    /*
    singleton instanciará um unico objeto que cumprirá todas as tarefas
    prototype instanciará o total de objetos necessários
    */

}
