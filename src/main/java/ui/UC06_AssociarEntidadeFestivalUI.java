package ui;

import controller.AssociarEntidadeFestivalController;
import model.Entidade;
import model.Festival;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC06_AssociarEntidadeFestivalUI {

    private GestFest empresa;
    private AssociarEntidadeFestivalController controller;
    private Festival festival;
    private Entidade entidade;

    UC06_AssociarEntidadeFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new AssociarEntidadeFestivalController(empresa);
    }

    void run() {
        controller.consultaFestival(introduzDadoFestival());

        controller.consultaEntidade(introduzDadoEntidade());

        apresentaDados();

        if (Utils.confirma("Confirma os dados da Associação? (S/N)")) {
            if (controller.associarFestivalEntidade()) {
                System.out.println("Associação registada com sucesso.");
            } else {
                System.out.println("Associação não registada com sucesso.");
            }
        }
    }

    private int introduzDadoEntidade() {
        return Utils.IntFromConsole("Introduza a referência da Entidade que pretende fazer Associação: ");
    }

    private String introduzDadoFestival() {
        return Utils.readLineFromConsole("Introduza o Festival que pretende associar a Entidade anteriormente introduzida: ");
    }

    private void apresentaDados() {

        System.out.println("\nFestival: ");
        System.out.println(controller.getFestivalAsString());
        System.out.println("\nEntidade: ");
        System.out.println(controller.getEntidadeAsString());

    }
}