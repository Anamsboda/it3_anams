/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ConsultarInformacaoFestivalController;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class UC4_ConsultarInformacaoFestivalUI {

    private GestFest empresa;
    private ConsultarInformacaoFestivalController controller;

    public UC4_ConsultarInformacaoFestivalUI(GestFest empresa) {
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
