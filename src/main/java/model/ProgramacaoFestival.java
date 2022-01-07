/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author andre
 */
public class ProgramacaoFestival {

    private int referencia;
    private Festival festival;
    private List<LocalDate> data;
    private HashSet<ProgramaDiario> programadia;

    private static int contador = 0;

    public ProgramacaoFestival() {
        this.referencia += contador;
        this.festival = new Festival();
        this.data = new ArrayList<>();
        this.programadia = new HashSet<>();
    }

    public ProgramacaoFestival(Festival festival, List<LocalDate> data, HashSet<ProgramaDiario> programadia, Artista artista, Palco palco) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.data = new ArrayList<>(data);
        this.programadia = new HashSet<ProgramaDiario>(programadia);
    }

    public ProgramacaoFestival(ProgramacaoFestival pf) {
        this.referencia = pf.referencia;
        this.festival = new Festival(pf.festival);
        this.data = new ArrayList<>(pf.data);
        this.programadia = new HashSet<ProgramaDiario>(pf.programadia);
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public List<LocalDate> getData() {
        return new ArrayList<>(data);
    }

    public HashSet<ProgramaDiario> getProgramadia() {
        return programadia;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setData(List<LocalDate> data) {
        this.data = new ArrayList<>(data);
    }

    public void setProgramadia(HashSet<ProgramaDiario> programadia) {
        this.programadia = programadia;
    }

    @Override
    public String toString() {
        return "ProgramacaoFestival{" + "referencia=" + referencia + ", festival=" + festival + ", programadia=" + programadia + '}';
    }

}
