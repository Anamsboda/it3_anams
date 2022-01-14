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
 * Dulce Mota <mdm@isep.ipp.pt>
 */
public class MenuRIF_UI {

    private GestFest empresa;
    private String opcao;

    public MenuRIF_UI(GestFest empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Consultar Informação de um Festival");
            System.out.println("2. Registar Festival");
            System.out.println("3. Associar Entidade Colaboradora a um Festival");
            System.out.println("4. Consultar Programação de um Festival");
            System.out.println("5. Comprar Bilhete");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                UC4_ConsultarInformacaoFestivalUI ui = new UC4_ConsultarInformacaoFestivalUI(empresa);

                ui.run();
            } else if (opcao.equals("2")) {
                UC5_RegistarFestivalUI ui = new UC5_RegistarFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("3")) {
                UC6_AssociarEntidadeFestivalUI ui = new UC6_AssociarEntidadeFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivaoUI ui = new UC10_ConsultarProgramacaoFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("5")) {
                UC12_ComprarBilheteUI ui = new UC12_ComprarBilheteUI(empresa);
                ui.run();
                // falta opcoes?
            }

        } while (!opcao.equals("0"));

    }
}
