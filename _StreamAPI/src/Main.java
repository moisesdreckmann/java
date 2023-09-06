import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Consumer - não tem retorno
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.forEach(n -> { //lambda function
            if(n%2==0) {
                System.out.println(n);
            }
        });
        System.out.println("\n");

        //Supplier - não tem argumento e retorna algo tipo Tipo
        List<String> saudacoes = Stream.generate(() -> "Olá tudo bem?")
                .limit(2)
                .toList();
        saudacoes.forEach(System.out::println);
        System.out.println("\n");

        //Function - argumento tipo Tipo e saida tipo Return
        List<Integer> numeros2 = Arrays.asList(1,2,3,4,5);
        //como é só para dobrar, ele recebe argumentos Integer (n e n*2),
        // mas poderia passar <Integer, String> para converter os numeros para String
        List<Integer> numerosDobrados = numeros2.stream()
                .map(n -> n*2)
                .toList();
        numerosDobrados.forEach(System.out::println);
        System.out.println("\n");

        //Predicate - aceita argumento Tipo e retorna bolean (funciona como um filtro)
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript");
        palavras.stream()
                .filter(palavraFiltrada -> palavraFiltrada.length() > 5)
                .forEach(System.out::println);
        System.out.println("\n");

        //BynaryOperator recebe dois argumentos de um Tipo e retorna do mesmo Tipo
        List<Integer> numeros3 = Arrays.asList(1,2,3,4,5);
        int resultado = numeros3
                .stream().reduce(Integer::sum)
                .orElse(0);
        System.out.println(resultado);




    }
}