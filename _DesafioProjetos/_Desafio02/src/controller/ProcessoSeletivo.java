package controller;

import Exceptions.InvalidosException;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import Exceptions.InvalidosException;

public class ProcessoSeletivo {
    public static void main(String[] args) throws InvalidosException {
        Scanner scanner = new Scanner(System.in);
        String[] candidatos = {"Maria", "João","José", "Moisés", "Eduardo"};
        int candidatosSelecionados = 1;
        int cadidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados <= 5) {
            String candidato = candidatos[cadidatoAtual];
            double salarioPretendido = valorPretendido();

            if(salarioPretendido <= salarioBase) {
                System.out.println("O candidato(a) "+candidato+" foi selecionado para a " +
                        "vaga e seu alario pretendido é : "+salarioPretendido);
                analisarCandidato(salarioPretendido, salarioBase);
            }
            candidatosSelecionados++;
            cadidatoAtual++;
        }
        System.out.println("\n");

        System.out.println("Informe o primeiro numero: ");
        int valor1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o segundo numero: ");
        int valor2 = scanner.nextInt();
        scanner.nextLine();

        contador(valor1, valor2);

        scanner.close();
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido, double salarioBase) {

        if (salarioPretendido < salarioBase) {
            System.out.println("ligar para o candidato");
        } else if(salarioPretendido == salarioBase){
            System.out.println("ligar para o candidato com contra proposta");
        } else {
            System.out.println("aguardando resultado dos demais");
        }
    }

    static void contador(int valor1, int valor2) throws InvalidosException {
        try {
            if(valor2 <= valor1) {
                throw new InvalidosException("O segundo numero precisa ser maior que o primeiro");
            } else {
                int valorMostrar = 1;
                for (int i = valor1; i <valor2; i ++) {
                    System.out.println(valorMostrar);
                    valorMostrar++;
                }
            }
        } catch (InvalidosException e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
