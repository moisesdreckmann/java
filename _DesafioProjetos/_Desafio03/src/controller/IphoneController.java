package controller;
import model.Iphone;
public class IphoneController {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.setLigar(true);
        iphone.setDesligar(true);
        System.out.println(iphone);
        System.out.println("\n");

        System.out.println(iphone.usarNavegador());
        System.out.println(iphone.abrirNovaAba());
        System.out.println(iphone.atualizarPagina());
        System.out.println(iphone.fecharNavegador());
        System.out.println("\n");

        System.out.println(iphone.reproduzir());
        System.out.println(iphone.pausar());
        System.out.println(iphone.parar());
    }
}
