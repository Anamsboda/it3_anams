package ui;

import java.io.IOException;
import model.GestFest;
import utilitarios.Utils;

/**
 *
 * @author grupox
 */

public class MenuRPF_UI {
    private GestFest empresa;
    private String opcao;

    public MenuRPF_UI(GestFest empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Convidar Artista/Banda ");
            System.out.println("2. Alterar Estado Artista/Banda");
            System.out.println("3. Definir Programação de um Festival");
            System.out.println("4. Consultar Programação de um Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                UC07_ConvidarArtistaBandaUI ui = new UC07_ConvidarArtistaBandaUI(empresa);
                ui.run();
            } else if (opcao.equals("2")) {
                UC08_AlterarEstadoArtistaBandaUI ui = new UC08_AlterarEstadoArtistaBandaUI(empresa);
                ui.run();
            } else if (opcao.equals("3")) {
                UC09_DefinirProgramacaoFestivalUI ui = new UC09_DefinirProgramacaoFestivalUI(empresa);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivalUI ui = new UC10_ConsultarProgramacaoFestivalUI(empresa);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}