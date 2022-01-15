package ui;

import controller.ComprarBilheteController;
import model.Compra;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupo12
 */

public class UC12_ComprarBilheteUI {
    private GestFest empresa;
    private Compra compra;
    private ComprarBilheteController controller;
    
    public UC12_ComprarBilheteUI(GestFest empresa){
        this.empresa = empresa;
        controller = new ComprarBilheteController(empresa);
    }
    
    public void run(){
        controller.ListarFestivais();
        empresa.procurarFestivalDesgn(Utils.readLineFromConsole("Insira o nome do festival que pretende comprar bilhete"));
        
        controller.MostrarTipoBilhete();
        controller.EscolherTipoBilhete();
    }
}