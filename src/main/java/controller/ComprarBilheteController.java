package controller;

import model.Compra;
import model.GestFest;

/**
 *
 * @author grupox
 */

public class ComprarBilheteController {
    private GestFest empresa;
    private Compra compra;
    
    public ComprarBilheteController(GestFest empresa){
        this.empresa = empresa;
    }
    
    public void ListarFestivais() {
        empresa.getFestivaisAsString();
    }
    
    public String MostrarTipoBilhete(){
        return empresa.getTiposBilheteAsString();
    }

    public void EscolherTipoBilhete() {
        
    }
}