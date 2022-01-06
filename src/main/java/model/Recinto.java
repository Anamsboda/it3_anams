/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class Recinto {

    private int codigoRecinto;
    private String nomeRecinto;
    private Localizacao localizacaoRecinto;
    private ArrayList<Palco> palcosFestival;
    private int nroPalcos;
    private int lotacaoRecinto;

    private static int nroRecinto = 0;

    private static final String STRING_POR_OMISSAO = "";
    private static final int INT_POR_OMISSAO = 0;

    public Recinto() {
        this.codigoRecinto = nroRecinto++;
        this.nomeRecinto = STRING_POR_OMISSAO;
        this.localizacaoRecinto = new Localizacao();
        this.palcosFestival = new ArrayList<Palco>();
        this.nroPalcos = INT_POR_OMISSAO;
        this.lotacaoRecinto = INT_POR_OMISSAO;
    }

    public Recinto(String nomeRecinto, Localizacao localizacaoRecinto, int lotacaoRecinto) {
        this.codigoRecinto = nroRecinto;
        this.nomeRecinto = nomeRecinto;
        this.localizacaoRecinto = localizacaoRecinto;
        this.palcosFestival = new ArrayList<Palco>();
        this.nroPalcos = palcosFestival.size();
        this.lotacaoRecinto = lotacaoRecinto;
    }

    public Recinto(Recinto recinto) {
        this.codigoRecinto = nroRecinto++;
        this.nomeRecinto = recinto.nomeRecinto;
        this.localizacaoRecinto = recinto.localizacaoRecinto;
        this.palcosFestival = recinto.palcosFestival;
        this.nroPalcos = recinto.palcosFestival.size();
        this.lotacaoRecinto = recinto.lotacaoRecinto;
    }

    public int getCodigoRecinto() {
        return codigoRecinto;
    }

    public String getNomeRecinto() {
        return nomeRecinto;
    }

    public Localizacao getLocalizacaoRecinto() {
        return localizacaoRecinto;
    }

    public ArrayList<Palco> getPalcosFestival() {
        return palcosFestival;
    }

    public int getNroPalcos() {
        return nroPalcos;
    }

    public int getLotacaoRecinto() {
        return lotacaoRecinto;
    }

    public void setCodigoRecinto(int codigo) {
        this.codigoRecinto = codigo;
    }

    public void setNomeRecinto(String nomeRecinto) {
        this.nomeRecinto = nomeRecinto;
    }

    public void setLocalizacaoRecinto(Localizacao localizacaoRecinto) {
        this.localizacaoRecinto = localizacaoRecinto;
    }

    public void setPalcosFestival(ArrayList<Palco> palcosFestival) {
        this.palcosFestival = palcosFestival;
    }

    public void setNroPalcos(int nroPalcos) {
        this.nroPalcos = nroPalcos;
    }

    public void setLotacaoRecinto(int lotacaoRecinto) {
        this.lotacaoRecinto = lotacaoRecinto;
    }

    public boolean valida() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Recinto other = (Recinto) obj;
        return this.nomeRecinto.equalsIgnoreCase(other.nomeRecinto)
                && this.localizacaoRecinto.equals(other.localizacaoRecinto)
                && this.palcosFestival.equals(other.palcosFestival)
                && this.nroPalcos == other.nroPalcos
                && this.lotacaoRecinto == other.lotacaoRecinto;
    }

    @Override
    public String toString() {
        return "Recinto{" + "codigoRecinto=" + codigoRecinto + ", nomeRecinto=" + nomeRecinto + ", localizacaoRecinto=" + localizacaoRecinto + ", palcosFestival=" + palcosFestival + ", nroPalcos=" + nroPalcos + ", lotacaoRecinto=" + lotacaoRecinto + '}';
    }
}
