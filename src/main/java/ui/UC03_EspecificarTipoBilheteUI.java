package ui;

import controller.EspecificarTipoBilheteController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC03_EspecificarTipoBilheteUI {

    private GestFest empresa;
    private EspecificarTipoBilheteController controller;

    public UC03_EspecificarTipoBilheteUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new EspecificarTipoBilheteController(empresa);
    }

    public void run() {
        System.out.println("\nNovo Tipo de Bilhete:");
        controller.novoTipoBilhete();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaTipoBilhete()) {
                System.out.println("Tipo de Bilhete registado com sucesso!");
            } else {
                System.out.println("Tipo de Bilhete não registado!");
            }
        }
    }

    private void introduzDados() {
        String tipoBilhete = Utils.readLineFromConsole("Introduza o Tipo de Bilhete: ");

        controller.setTipoBilhete(tipoBilhete);
    }

    private void apresentaDados() {
        System.out.println("\nTipo de Bilhete:\n" + controller.getTipoBilheteAsString());
    }
}