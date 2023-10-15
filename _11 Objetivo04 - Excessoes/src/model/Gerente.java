package model;
import model.Funcionario;
public class Gerente extends Funcionario{
    private String formacao;

    public Gerente(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }

    public Gerente() {

    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void autorizarCompra() {
        System.out.println("a compra foi autorizada");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "formacao='" + formacao + '\'' +
                "} " + super.toString();
    }
}
