/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @actor hugoqueiroz
 */
public class MenuInicial_UI {

    private GestFest empresa;
    private String opcao;

    public MenuInicial_UI(GestFest empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Administrador (APG) ");
            System.out.println("2. Responsável pela Introdução/Registo de um Festival (RIF)  ");
            System.out.println("3. Responsável pela Programação do Festival (RPF)");
            System.out.println("4. Responsável pela Bilhética do Festival (RBF)");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                MenuAPG_UI ui = new MenuAPG_UI(empresa);
                ui.run();
            } else if (opcao.equals("2")) {
                MenuRIF_UI ui = new MenuRIF_UI(empresa);
                ui.run();
            } else if (opcao.equals("3")) {
                MenuRPF_UI ui = new MenuRPF_UI(empresa);
                ui.run();
            }else if(opcao.equals("4")){
                MenuRBF_UI ui = new MenuRBF_UI(empresa);
                ui.run();
            }

        } while (!opcao.equals("0"));
    }
}
