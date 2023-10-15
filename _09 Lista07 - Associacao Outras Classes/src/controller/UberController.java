package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class UberController {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(1L, "moises", "aaa@gmail.com", "123456789");
        Motorista m1 = new Motorista(1L, "joao", "bbb@gmail.com", "123456987");
        LocalDate anoFabricacao = LocalDate.of(1999, 5, 5);
        Veiculo v1 = new Veiculo(1L, "gol", "AJD32", anoFabricacao, m1);

        LocalDate inicioCorrida1 = LocalDate.of(2023, 1, 1);
        LocalDate inicioCorrida2 = LocalDate.of(2023, 1, 3);
        Corrida c1 = new Corrida(1L, "pix", "pago por pix", inicioCorrida1, 20.20);
        Corrida c2 = new Corrida(2L, "pix", "pago por pix", inicioCorrida2, 13.90);

        u1.getCorridas().add(c1);
        u1.getCorridas().add(c2);
        m1.getCorridas().add(c1);
        m1.getCorridas().add(c2);

        imprimirCorridasPorUsuario(u1);
        System.out.println("\n");
        imprimirCorridasPorMotorista(m1);
        System.out.println("\n");
        valorTotal(m1);
    }

    private static void imprimirCorridasPorUsuario(Usuario usuario) {
        List<Corrida> corridas = usuario.getCorridas();
        System.out.println("corridas para o usuario " + usuario.getNome());
        corridas.sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        for (Corrida corrida : corridas) {
            System.out.println(corrida);
        }
    }

    private static void imprimirCorridasPorMotorista(Motorista motorista) {
        List<Corrida> corridas = motorista.getCorridas();
        System.out.println("corridas para o motorista " + motorista.getNome());
        corridas.sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        for(Corrida corrida : corridas) {
            System.out.println(corrida);
        }
    }

    private static void valorTotal(Motorista motorista) {
        List<Corrida> corridas = motorista.getCorridas();
        double valorTotal = corridas.stream()
                .mapToDouble(Corrida::getPreco)
                .sum();
        System.out.println("Valor Total: " + String.format("%.1f", valorTotal));
    }
}
