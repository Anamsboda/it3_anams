package controller;

import java.time.LocalDate;
import model.Artista;
import model.Festival;
import model.GestFest;
import model.ProgramaDiario;
import model.ProgramacaoFestival;

/**
 *
 * @author grupo10
 */

public class DefinirProgramacaoFestivalController {

    private GestFest empresa;
    private Festival festival;
    private ProgramacaoFestival pf;
    private ProgramaDiario pd;

    public DefinirProgramacaoFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void ListarFestivais() {
        empresa.getFestivaisAsString();
    }

    public void ProcurarFestival(String nome) {
        this.festival = empresa.procurarFestivalDesgn(nome);
    }

    public Festival getFestival() {
        return this.festival;
    }

    public LocalDate getDataInicioFestival() {
        return festival.getDataInicioFestival();
    }

    public LocalDate getDataFimFestival() {
        return festival.getDataFimFestival();
    }

    public ProgramacaoFestival getPf() {
        return pf;
    }

    public void setPf(ProgramacaoFestival pf) {
        this.pf = pf;
    }

    public ProgramaDiario getPd() {
        return pd;
    }

    public void setPd(ProgramaDiario pd) {
        this.pd = pd;
    }

    public Artista ProcurarArtista(String artista) {
         return empresa.procurarArtista(artista);
    }   
}