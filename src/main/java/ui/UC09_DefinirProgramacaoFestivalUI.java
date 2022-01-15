package ui;

import java.time.*;
import controller.DefinirProgramacaoFestivalController;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import model.Atuacao;
import model.Festival;
import model.GestFest;
import model.Palco;
import model.ProgramaDiario;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC09_DefinirProgramacaoFestivalUI {
    private GestFest empresa;
    private Festival festival;
    private DefinirProgramacaoFestivalController controller;

    public UC09_DefinirProgramacaoFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new DefinirProgramacaoFestivalController(empresa);
    }

    public void run() {
        controller.ListarFestivais();
        controller.ProcurarFestival(Utils.readLineFromConsole("Introduza o nome do festival"));

        criacaoProgramaFestival();
    }

    public void criacaoProgramaFestival() {
        controller.getPf().setFestival(controller.getFestival());
        List<LocalDate> datas = getDaysBetweenDates(controller.getDataInicioFestival(), controller.getDataFimFestival());
        controller.getPf().setData(datas);
        HashSet<ProgramaDiario> pd = new HashSet<>();
        for (LocalDate ld : datas) {
            pd.add(criacaoProgramaDiario(ld));
        }
        controller.getPf().setProgramadia(pd);
    }

    public ProgramaDiario criacaoProgramaDiario(LocalDate ld) {
        ProgramaDiario pd = new ProgramaDiario();
        pd.setFestival(controller.getFestival());
        pd.setData(ld);
        pd.setLstAtuacoes(criacaoAtuacoes(ld));
        return pd;
    }

    public static List<LocalDate> getDaysBetweenDates(LocalDate startdate, LocalDate enddate) {
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
    }

    public HashSet<Atuacao> criacaoAtuacoes(LocalDate ld) {
        HashSet<Atuacao> atuacao = new HashSet<Atuacao>();
        do {
            Atuacao at = new Atuacao();
            try {
                at.setArtista(controller.ProcurarArtista(inserirArtista()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            at.setDataInicio(inserirHoraInicio(ld));
            at.setDataFim(inserirHoraFim(ld));
            at.setDuracao(Duration.between(at.getDataInicio(), at.getDataFim()));
            at.setPalco(inserirPalco());
            atuacao.add(at);
        } while (Utils.confirma("Deseja inserir mais atuações nesta data? (S/N)"));
        return atuacao;
    }

    public Palco inserirPalco() {
        List<Palco> palcos = new ArrayList<Palco>(controller.getFestival().getRecintoFestival().getPalcosFestival());
        for (Palco p : palcos) {
            System.out.println(p);
        }
        int numpalco = Utils.IntFromConsole("Insira o número do palco que pretende escolher");
        return palcos.get(numpalco - 1);
    }

    public LocalDateTime inserirHoraInicio(LocalDate ld) {
        int hora = 0;
        int minuto = 0;
        do {
            hora = Utils.IntFromConsole("Inserir hora de inicio do festival");
        } while (hora < 0 && hora > 23);
        do {
            minuto = Utils.IntFromConsole("Inserir minto de inicio de festival");
        } while (minuto < 0 && minuto > 59);
        LocalTime lt = LocalTime.of(hora, minuto);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        return ldt;
    }

    public LocalDateTime inserirHoraFim(LocalDate ld) {
        int hora = 0;
        int minuto = 0;
        do {
            hora = Utils.IntFromConsole("Inserir hora de inicio do festival");
        } while (hora < 0 && hora > 23);
        do {
            minuto = Utils.IntFromConsole("Inserir minto de inicio de festival");
        } while (minuto < 0 && minuto > 59);
        LocalTime lt = LocalTime.of(hora, minuto);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        return ldt;
    }

    public String inserirArtista() {
        return Utils.readLineFromConsole("Insira o nome do artista");
    }
}
