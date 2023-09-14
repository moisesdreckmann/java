package model;

public class Iphone extends Telefone implements Musica, Internet{
    @Override
    public String usarNavegador() {
        return "estou abrindo o navegador";
    }

    @Override
    public String abrirNovaAba() {
        return "estou abrindo nova aba";
    }

    @Override
    public String atualizarPagina() {
        return "estou atualizando a pagina";
    }

    @Override
    public String fecharNavegador() {
        return "estou fechando o navegador";
    }

    @Override
    public String reproduzir() {
        return "estou reproduzindo a musica";
    }

    @Override
    public String pausar() {
        return "estou pausando a musica";
    }

    @Override
    public String parar() {
        return "estou parando o aplicativo";
    }
    }
