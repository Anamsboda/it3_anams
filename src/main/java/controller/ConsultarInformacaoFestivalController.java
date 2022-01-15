package controller;

import model.Festival;
import model.GestFest;

/**
 *
 * @author grupo10
 */

public class ConsultarInformacaoFestivalController {
    private final GestFest empresa;
    private Festival festival;

    public ConsultarInformacaoFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void procurarFestival(String festival) {
        this.festival = empresa.procurarFestivalDesgn(festival);
    }

    public String getInformacaoFestivalAsString() {
        return this.festival.toString();
    }
}