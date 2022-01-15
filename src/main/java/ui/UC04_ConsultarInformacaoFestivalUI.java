package ui;

import controller.ConsultarInformacaoFestivalController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC04_ConsultarInformacaoFestivalUI {

    private GestFest empresa;
    private ConsultarInformacaoFestivalController controller;

    public UC04_ConsultarInformacaoFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new ConsultarInformacaoFestivalController(empresa);
    }

    public void run() {
        controller.procurarFestival(introduzDados());

        apresentaDados();
    }

    private String introduzDados() {
        String festival = Utils.readLineFromConsole("Introduza o nome do festival: ");
        return festival;
    }

    private void apresentaDados() {
        System.out.println("\nFestival:\n" + controller.getInformacaoFestivalAsString());
    }
}