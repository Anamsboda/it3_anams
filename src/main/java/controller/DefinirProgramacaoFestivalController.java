/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author andre
 */
public class DefinirProgramacaoFestivalController {

    private GestFest empresa;

    public DefinirProgramacaoFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void ListarFestivais() {
        empresa.getFestivaisAsString();
    }

    public void ProcurarFestival(String nome) {
        empresa.procurarFestivalDesgn(nome);
    }
    
}
