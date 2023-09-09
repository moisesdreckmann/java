package orgMoises._spring.DocProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration //indica que é uma configuração
@ConfigurationProperties(prefix = "remetente") //passa rementente como propriedade
//que será encontrado no documento properties
public class Remetente {
    private String nome;
    private String email;
    private List<Integer> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Integer> telefones) {
        this.telefones = telefones;
    }

    //essa classe ficará como uma configuração para que possa
    //ser acessada no properties. O acesso ficou em values->Mensagem
}
