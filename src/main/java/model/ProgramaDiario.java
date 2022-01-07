/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author andre
 */
public class ProgramaDiario {

    private int referencia;
    private Festival festival;
    private LocalDate data;
    private HashSet<Atuacao> lstAtuacoes;

    private static int contador = 0;

    public ProgramaDiario() {
        this.referencia += contador;
        this.data = LocalDate.now();
        this.festival = new Festival();
        this.lstAtuacoes = new HashSet<>();
    }

    public ProgramaDiario(Festival festival, LocalDate data) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.data = data;
        this.lstAtuacoes = new HashSet<>();
    }

    public ProgramaDiario(Festival festival, LocalDate data, HashSet<Atuacao> lsAtuacaos) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.data = data;
        this.lstAtuacoes = new HashSet<Atuacao>(lstAtuacoes);
    }

    public ProgramaDiario(ProgramaDiario pd) {
        this.referencia = pd.referencia;
        this.festival = new Festival(pd.festival);
        this.data = pd.data;
        this.lstAtuacoes = new HashSet<Atuacao>(pd.lstAtuacoes);
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public LocalDate getData() {
        return data;
    }

    public HashSet<Atuacao> getLstAtuacoes() {
        return lstAtuacoes;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLstAtuacoes(HashSet<Atuacao> lstAtuacoes) {
        this.lstAtuacoes = lstAtuacoes;
    }

    @Override
    public String toString() {
        return "ProgramaDiario{" + "referencia=" + referencia + ", festival=" + festival + ", data=" + data + ", lstAtuacoes=" + lstAtuacoes + '}';
    }

}
