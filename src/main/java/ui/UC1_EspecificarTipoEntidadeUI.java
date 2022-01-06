/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.EspecificarTipoEntidadeController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class UC1_EspecificarTipoEntidadeUI {

    private GestFest empresa;
    private EspecificarTipoEntidadeController controller;

    public UC1_EspecificarTipoEntidadeUI(GestFest empresa) {
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
