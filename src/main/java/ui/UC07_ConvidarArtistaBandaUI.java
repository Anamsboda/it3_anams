package ui;

import controller.ConvidarArtistaBandaController;
import model.GestFest;

/**
 *
 * @author grupo10
 */

class UC07_ConvidarArtistaBandaUI {
    private GestFest empresa;
    private ConvidarArtistaBandaController controller;

    public UC07_ConvidarArtistaBandaUI(GestFest empresa){
        this.empresa = empresa;
        this.controller = new ConvidarArtistaBandaController(empresa);
    }
    
    public void run(){
        
    }
}