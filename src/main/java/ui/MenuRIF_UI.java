package ui;

import java.io.IOException;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @actor grupox
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
                UC04_ConsultarInformacaoFestivalUI ui = new UC04_ConsultarInformacaoFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("2")) {
                UC05_RegistarFestivalUI ui = new UC05_RegistarFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("3")) {
                UC06_AssociarEntidadeFestivalUI ui = new UC06_AssociarEntidadeFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivalUI ui = new UC10_ConsultarProgramacaoFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("5")) {
                UC12_ComprarBilheteUI ui = new UC12_ComprarBilheteUI(empresa);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}