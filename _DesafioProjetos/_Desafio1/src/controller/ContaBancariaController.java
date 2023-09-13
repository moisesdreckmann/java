package controller;
import java.util.Scanner;
import model.ContaBancaria;
import java.util.Locale;

public class ContaBancariaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("digite o numero da conta: ");
        contaBancaria.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.println("digite a agencia da conta: ");
        contaBancaria.setAgencia(scanner.nextLine());
        System.out.println("digite seu nome: ");
        contaBancaria.setNome(scanner.nextLine());
        System.out.println("digite o saldo: ");
        contaBancaria.setSaldo(scanner.nextDouble());

        System.out.println(contaBancaria);
    }
}
