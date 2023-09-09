package orgMoises._springWebAPIRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // detecta o bean responsavel pelo http
public class WelcomeController {
    @GetMapping //metodo que aceita requisições get
    public String welcome() {
        return "Bem vindo à minha pagina Springboot Web";
    }
}
