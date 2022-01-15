package ui;

import model.GestFest;

/**
 *
 * @author grupo10
 */

public class UC10_ConsultarProgramacaoFestivalUI {
    private GestFest empresa;
    private ConsultarProgramacaoFestivalController controller;

    public UC10_ConsultarProgramacaoFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        this.controller = new ConsultarProgramacaoFestivalController(empresa);
    }
    
    public void run(){
        
    }
}