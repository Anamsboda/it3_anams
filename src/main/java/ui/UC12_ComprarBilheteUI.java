package ui;

import controller.ComprarBilheteController;
import java.util.ArrayList;
import model.Compra;
import model.GestFest;
import model.TipoBilhete;
import utilitarios.Utils;

/**
 *
 * @author grupo12
 */
public class UC12_ComprarBilheteUI {

    private GestFest empresa;
    private Compra compra;
    private ComprarBilheteController controller;

    public UC12_ComprarBilheteUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new ComprarBilheteController(empresa);
    }

    public void run() {
        System.out.println("Compra bilhetes");

        controller.novaCompra();
        controller.procurarFestival(introduzFestival());
        String tipoBilhete = controller.getTipoBilhetes();

        controller.setTipoBilhete(introduzTipoBilhete(tipoBilhete.length()));

        controller.setNumBilhetes(introduzNumBilhetes(controller.getBilhetesDisponiveis()));

        controller.verificaDesconto();

        apresentaDados();

        if (Utils.confirma("Prentende inserir este plano? (S/N)")) {

        }
    }

    private String introduzFestival() {
        return Utils.readLineFromConsole("Insira o festival a trabalhar");
    }

    private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp) {
        int a = 0;
        do {
            a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getTipoBilhete());
        } while (a < 0 || a > lotacao);
        return new Integer(a);
    }

    private int introduzTipoBilhete(int num) {
        int a = 0;
        do {
            a = Utils.IntFromConsole("Insira o número do tipo de Bilhete que pretende aquirir");
        } while (a < 0 || a > num);
        return a;
    }

    private int introduzNumBilhetes(int numBilhetes) {
        System.out.println("Existem " + numBilhetes + " bilhetes disponíveis do tipo selecionado");
        int a = 0;
        if (Utils.confirma("Pretende aquirir bilhetes deste tipo?")) {
            do {
                a = Utils.IntFromConsole("Insira o número de bilhetes que pretende aquirir");
            } while (a < 0 || a > numBilhetes);
        }
        return a;
    }
}


