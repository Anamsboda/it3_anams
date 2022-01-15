package ui;

import controller.AlterarEstadoArtistaBandaController;
import model.GestFest;

/**
 *
 * @author grupo10
 */

public class UC08_AlterarEstadoArtistaBandaUI {
    private GestFest empresa;
    private AlterarEstadoArtistaBandaController controller;

    public UC08_AlterarEstadoArtistaBandaUI(GestFest empresa) {
        this.empresa = empresa;
        this.controller = new AlterarEstadoArtistaBandaController(empresa);
    }
    
    public void run(){
        
    }
}