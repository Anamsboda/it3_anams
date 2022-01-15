package controller;

import java.time.LocalDate;
import model.Festival;
import model.GestFest;
import model.Recinto;

/**
 *
 * @author grupo10
 */

public class RegistarFestivalController {

    private final GestFest empresa;
    private Festival festival;

    public RegistarFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novoFestival() {
        this.festival = empresa.novoFestival();
    }

    public String getDesignacao() {
        return this.festival.getDesignacaoFestival();
    }

    public String getEdicaoFestival() {
        return this.festival.getEdicaoFestival();
    }

    public LocalDate getDataInicioFestival() {
        return this.festival.getDataInicioFestival();
    }

    public Recinto getRecintoFestival() {
        return new Recinto(this.festival.getRecintoFestival());
    }

    public void setDesignacao(String designacao) {
        this.festival.setDesignacaoFestival(designacao);
    }

    public void setEdicaoFestival(String edicao) {
        this.festival.setEdicaoFestival(edicao);
    }

    public void setDataInicioFestival(LocalDate dataInicio) {
        this.festival.setDataInicioFestival(dataInicio);
    }

    public void setRecintoFestival(Recinto recinto) {
        this.festival.setRecintoFestival(recinto);
    }

    public boolean registaFestival() {
        return this.empresa.registaFestival(this.festival);
    }

    public String getFestivalAsString() {
        return this.festival.toString();
    }
}