package ui;

import controller.RegistarEntidadeController;
import java.util.ArrayList;
import model.GestFest;
import model.TipoEntidade;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC02_RegistarEntidadeUI {

    private GestFest empresa;
    private RegistarEntidadeController controller;

    public UC02_RegistarEntidadeUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new RegistarEntidadeController(empresa);
    }

    public void run() {
        System.out.println("\n Nova Entidade: ");
        controller.novaEntidade();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaEntidade()) {
                System.out.println("Entidade registada com sucesso!");
            } else {
                System.out.println("Entidade não registada");
            }
        }
    }

    private void introduzDados() {
        String designacao = Utils.readLineFromConsole("Introduza a designação da Entidade: ");
        do {
            String tipoEntidade = Utils.readLineFromConsole("Introduza o Tipo de Entidade: ");
            controller.adicionaTipoEntidade(new TipoEntidade(tipoEntidade));
        } while (Utils.confirma("Confirma os dados? (S/N)"));

        controller.setDesignacao(designacao);
    }

    private void apresentaDados() {
        System.out.println("\nEntidade:\n" + controller.getEntidadeAsString());
    }
}