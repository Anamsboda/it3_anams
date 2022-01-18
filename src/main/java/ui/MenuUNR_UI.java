/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.io.IOException;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author andre
 */
public class MenuUNR_UI {
    private GestFest empresa;
    private String opcao;
    
    public MenuUNR_UI(GestFest empresa){
        this.empresa = empresa;
    }
    
    public void run() throws IOException{
        do{
            System.out.println("###### MENU #####\n\n");
            System.out.println("1- Comprar Bilhetes");
            
            opcao = Utils.readLineFromConsole("Introduza a sua opção: ");
            
            if(opcao.equals("1")){
                UC12_ComprarBilheteUI ui = new UC12_ComprarBilheteUI(empresa);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}
