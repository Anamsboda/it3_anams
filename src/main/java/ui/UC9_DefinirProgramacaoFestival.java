/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.DefinirProgramacaoFestivalController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Festival;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author andre
 */
public class UC9_DefinirProgramacaoFestival {

    private GestFest empresa;
    private Festival festival;
    private DefinirProgramacaoFestivalController controller;

    public UC9_DefinirProgramacaoFestival(GestFest empresa) {
        this.empresa = empresa;
        controller = new DefinirProgramacaoFestivalController(empresa);
    }

    public void run() {
        controller.ListarFestivais();
        controller.ProcurarFestival(Utils.readLineFromConsole("Introduza o nome do festival"));

    }

    public void diasFestival() {
        int duracao = Days.daysBetween(festival.getDataInicioFestival(), festival.getDataFimFestival()).getDays();
        List<LocalDate> dates = new ArrayList<LocalDate>(duracao);  // Set initial capacity to `days`.
        for (int i = 0; i < duracao; i++) {
            LocalDate d = festival.getDataInicioFestival().withFieldAdded(DurationFieldType.days(), i);
            dates.add(d);
        }
    }
}
