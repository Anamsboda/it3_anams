package ui;

import controller.RegistarFestivalController;
import java.util.Date;
import model.GestFest;
import model.Recinto;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */

public class UC05_RegistarFestivalUI {

    private GestFest empresa;
    private RegistarFestivalController controller;

    public UC05_RegistarFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new RegistarFestivalController(empresa);
    }

    public void run() {
        System.out.println("\n Novo Festival: ");
        controller.novoFestival();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N) ")) {
            if (controller.registaFestival()) {
                System.out.println("Festival registado com sucesso!");
            } else {
                System.out.println("Festival não registado!");
            }
        }
    }

    private void introduzDados() {
        String designacao = Utils.readLineFromConsole("Introduz a designação do Festival: ");
        String edicao = Utils.readLineFromConsole("Introduz a edição do Festival: ");
        Date dataInicio = Utils.readDateFromConsole("Introduza a Data de Inicio do Festival: ");
        Date dataFim = Utils.readDateFromConsole("Introduza a Data de Fim do Festival: ");
        //LISTAR RECINTOS
        int escolhaRecinto = Utils.IntFromConsole("Introduza o código do recinto utilizado no festival: ");
        Recinto recinto = empresa.procurarRecinto(escolhaRecinto);
    }

    private void apresentaDados() {
        System.out.println("\nFestival:\n" + controller.getFestivalAsString());
    }
}