/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.EspecificarTipoBilheteController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class UC3_EspecificarTipoBilheteUI {

    private GestFest empresa;
    private EspecificarTipoBilheteController controller;

    public UC3_EspecificarTipoBilheteUI(GestFest empresa) {
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
