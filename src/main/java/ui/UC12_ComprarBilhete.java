/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ComprarBilheteController;
import model.Compra;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author andre
 */
public class UC12_ComprarBilhete {
    private GestFest empresa;
    private Compra compra;
    private ComprarBilheteController controller;
    
    public UC12_ComprarBilhete(GestFest empresa){
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
