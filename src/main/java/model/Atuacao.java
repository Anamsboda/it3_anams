/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import utilitarios.Data;
import utilitarios.DataHora;

/**
 *
 * @author danie
 */
public class Atuacao {

    private int codigo;
    private Artista artista;
    private DataHora dataInicio;
    private DataHora dataFim;
    private int duracao;
    private Palco palco;

    private static int nroAtuacao = 0;
    private static final int INT_POR_OMISSAO = 0;

    public Atuacao() {
        this.codigo = nroAtuacao++;
        this.artista = new Artista();
        this.dataInicio = new DataHora();
        this.dataFim = new DataHora();
        this.duracao = INT_POR_OMISSAO;
        this.palco = new Palco();
    }

    public Atuacao(Artista artista, DataHora dataInicio, DataHora dataFim, int duracao, Palco palco) {
        this.codigo = nroAtuacao++;
        this.artista = new Artista(artista);
        this.dataInicio = new DataHora(dataInicio);
        this.dataFim = new DataHora(dataFim);
        this.duracao = duracao;
        this.palco = new Palco(palco);
    }

    public Atuacao(Atuacao atuacao) {
        this.codigo = nroAtuacao++;
        this.artista = atuacao.artista;
        this.dataInicio = atuacao.dataInicio;
        this.dataFim = atuacao.dataFim;
        this.duracao = atuacao.duracao;
        this.palco = atuacao.palco;
    }

    public int getCodigo() {
        return codigo;
    }

    public Artista getArtista() {
        return artista;
    }

    public DataHora getDataInicio() {
        return dataInicio;
    }

    public DataHora getDataFim() {
        return dataFim;
    }

    public int getDuracao() {
        return duracao;
    }

    public Palco getPalco() {
        return palco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setArtista(Artista artista) {
        this.artista = new Artista(artista);
    }

    public void setDataInicio(DataHora dataInicio) {
        this.dataInicio = new DataHora(dataInicio);
    }

    public void setDataFim(DataHora dataFim) {
        this.dataFim = new DataHora(dataFim);
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPalco(Palco palco) {
        this.palco = new Palco(palco);
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Atuacao{" + "codigo=" + codigo + ", artista=" + artista + ", dataInicio=" + dataInicio + ", duracao=" + duracao + ", palco=" + palco + '}';
    }

}
