package ui;

import controller.ConsultarVendasBilheteController;
import model.GestFest;

/**
 *
 * @author grupo13
 */

class UC13_ConsultarVendasBilheteUI {
    private GestFest empresa;
    private ConsultarVendasBilheteController controller;

    public UC13_ConsultarVendasBilheteUI(GestFest empresa) {
        this.empresa = empresa;
        this.controller = new ConsultarVendasBilheteController(empresa);
    }
    
    public void run(){
        
    }
}