/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;

/**
 *
 * @author andre
 */
public class ProgramacaoFestival {

    private int referencia;
    private Festival festival;
    private HashSet<ProgramaDiario> programadia;
    
    private static int contador = 0;

    public ProgramacaoFestival() {
        this.referencia += contador;
        this.festival = new Festival();
        this.programadia = new ProgramaDiario();
        this.artista = new Artista();
        this.palco = new Palco();
    }

    public ProgramacaoFestival(Festival festival, ProgramaDiario programadia, Artista artista, Palco palco) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.programadia = new ProgramaDiario(programadia);
        this.artista = new Artista(artista);
        this.palco = new Palco(palco);
    }

    public ProgramacaoFestival(ProgramacaoFestival pf) {
        this.referencia = pf.referencia;
        this.festival = new Festival(pf.festival);
        this.programadia = new ProgramaDiario(pf.programadia);
        this.artista = new Artista(pf.artista);
        this.palco = new Palco(pf.palco);
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public ProgramaDiario getProgramadia() {
        return programadia;
    }

    public Artista getArtista() {
        return artista;
    }

    public Palco getPalco() {
        return palco;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setProgramadia(ProgramaDiario programadia) {
        this.programadia = programadia;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setPalco(Palco palco) {
        this.palco = palco;
    }

    @Override
    public String toString() {
        return "ProgramacaoFestival{" + "referencia=" + referencia + ", festival=" + festival + ", programadia=" + programadia + ", artista=" + artista + ", palco=" + palco + '}';
    }

}
