package ui;

import controller.EspecificarTipoEntidadeController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC01_EspecificarTipoEntidadeUI {
    private GestFest empresa;
    private EspecificarTipoEntidadeController controller;

    public UC01_EspecificarTipoEntidadeUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new EspecificarTipoEntidadeController(empresa);
    }

    public void run() {
        System.out.println("\nNovo Tipo de Entidade:");
        controller.novoTipoEntidade();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaTipoEntidade()) {
                System.out.println("Tipo de entidade registado com sucesso!");
            } else {
                System.out.println("Tipo de entidade não registado!");
            }
        }
    }

    private void introduzDados() {
        String designacao = Utils.readLineFromConsole("Introduza a designação do Tipo de entidade: ");

        controller.setDesignacao(designacao);
    }

    private void apresentaDados() {
        System.out.println("\nTipo de Entidade:\n" + controller.getTipoEntidadeAsString());
    }
}