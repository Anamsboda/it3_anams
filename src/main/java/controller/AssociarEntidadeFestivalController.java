package controller;

import java.util.ArrayList;
import model.Entidade;
import model.Festival;
import model.GestFest;

/**
 *
 * @author grupo10
 */

public class AssociarEntidadeFestivalController {

    private GestFest gestfest;
    private Festival festival;
    private Entidade entidade;

    private GestFest empresa;

    public AssociarEntidadeFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void consultaFestival(String festival) {
        this.festival = gestfest.procurarFestivalDesgn(festival);
    }

    public void consultaEntidade(int referencia) {
        this.entidade = gestfest.procurarEntidade(referencia);
    }

    public boolean associarFestivalEntidade() {
        ArrayList<Entidade> e = this.festival.getEntidadeColaboradora();
        e.add(entidade);
        this.festival.setEntidadeColaboradora(e);
        return true;
    }

    public String getFestivalAsString() {
        return this.festival.toString();
    }

    public String getEntidadeAsString() {
        return this.entidade.toString();
    }
}
