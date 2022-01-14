/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Compra;
import model.GestFest;

/**
 *
 * @author andre
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
}
