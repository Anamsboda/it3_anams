/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.AssociarEntidadeFestivalController;
import model.Entidade;
import model.Festival;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class UC6_AssociarEntidadeFestivalUI {
    private GestFest empresa;
    private AssociarEntidadeFestivalController controller;
    private Festival festival;
    private Entidade entidade;

    UC6_AssociarEntidadeFestivalUI(GestFest empresa) {
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

