package controller;

import model.Locacao;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocacaoController {
    public static void main(String[] args) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        Date dataInicio = null;
        Time horaInicio = Time.valueOf("13:24:22");
        Date dataFim = null;
        Time horaFim = Time.valueOf("16:24:22");

        try {
            dataInicio = formatoData.parse("05/04/22");
            dataFim = formatoData.parse("08/04/22");

        } catch (Exception e) {
            e.printStackTrace();
        }

        Locacao l1 = new Locacao(1, dataInicio, horaInicio, dataFim, horaFim, 1000, 4.5, 55.0, true);

        System.out.println(l1);
    }
}
