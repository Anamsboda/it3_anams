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
public class MenuRBF_UI {

    private GestFest empresa;
    private String opcao;

    public MenuRBF_UI(GestFest empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Planeamento da Bilhética ");
            System.out.println("2. Consultar Vendas de Bilhetes");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção :");
            
            if (opcao.equals("1")){
                UC11_RegistarPlaneamentoBilheticaUI ui = new UC11_RegistarPlaneamentoBilheticaUI(empresa);
                ui.run();
            }
            else if(opcao.equals("2")){
                UC13_ConsultarVendasBilheteUI ui = new UC13_ConsultarVendasBilheteUI(empresa);
                ui.run();
            }
        }while(!opcao.equals("0"));
    
    
    }
}
