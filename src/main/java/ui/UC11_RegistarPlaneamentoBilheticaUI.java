package ui;

import model.GestFest;

/**
 *
 * @author grupo11
 */

class UC11_RegistarPlaneamentoBilheticaUI {
    private GestFest empresa;
    private RegistarPlaneamentoBilheticaController controller;

    public UC11_RegistarPlaneamentoBilheticaUI(GestFest empresa) {
        this.empresa = empresa;
        this.controller = new RegistarPlaneamentoBilheticaController(empresa);
    }
    
    public void run(){
        
    }
}