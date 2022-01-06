/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import utilitarios.Data;
import utilitarios.DataHora;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class Festival {

    private int referenciaFestival;
    private String designacaoFestival;
    private ArrayList<Entidade> entidadeColaboradora;
    private String edicaoFestival;
    private DataHora dataInicioFestival;
    private DataHora dataFimFestival;
    private Recinto recintoFestival;

    private static int nroFestival = 0;

    private static final String STRING_POR_OMISSAO = "";

    public Festival() {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = STRING_POR_OMISSAO;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival = STRING_POR_OMISSAO;
        this.dataInicioFestival = new DataHora();
        this.dataFimFestival = new DataHora();
        this.recintoFestival = new Recinto();
    }

    public Festival(String designacao, String edicao, DataHora dataInicio, DataHora dataFimFestiva, Recinto recinto) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = designacao;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival = edicao;
        this.dataInicioFestival = dataInicio;
        this.dataInicioFestival = dataFimFestival;
        this.recintoFestival = new Recinto(recinto);
    }

    public Festival(String designacao, ArrayList<Entidade> entidadeColaboradora, String edicao, DataHora dataInicio, DataHora dataFimFestival, Recinto recinto) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = designacao;
        this.entidadeColaboradora = new ArrayList<>(entidadeColaboradora);
        this.edicaoFestival = edicao;
        this.dataInicioFestival = dataInicio;
        this.dataFimFestival = dataFimFestival;
        this.recintoFestival = new Recinto(recinto);
    }

    public Festival(Festival festival) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = festival.designacaoFestival;
        this.edicaoFestival = festival.edicaoFestival;
        this.dataInicioFestival = festival.dataInicioFestival;
        this.dataFimFestival = festival.dataFimFestival;
        this.recintoFestival = new Recinto(festival.recintoFestival);
    }

    public int getReferenciaFestival() {
        return referenciaFestival;
    }

    public String getDesignacaoFestival() {
        return designacaoFestival;
    }

    public ArrayList<Entidade> getEntidadeColaboradora() {
        return entidadeColaboradora;
    }

    public String getEdicaoFestival() {
        return edicaoFestival;
    }

    public DataHora getDataInicioFestival() {
        return dataInicioFestival;
    }

    public DataHora getDataFimFestival() {
        return dataFimFestival;
    }

    public Recinto getRecintoFestival() {
        return recintoFestival;
    }

    public void setReferenciaFestival(int referenciaFestival) {
        this.referenciaFestival = referenciaFestival;
    }

    public void setDesignacaoFestival(String designacaoFestival) {
        this.designacaoFestival = designacaoFestival;
    }

    public void setEntidadeColaboradora(ArrayList<Entidade> entidadeColaboradora) {
        this.entidadeColaboradora = entidadeColaboradora;
    }

    public void setEdicaoFestival(String edicaoFestival) {
        this.edicaoFestival = edicaoFestival;
    }

    public void setDataInicioFestival(DataHora dataInicioFestival) {
        this.dataInicioFestival = dataInicioFestival;
    }

    public void setDataFimFestival(DataHora dataFimFestival) {
        this.dataFimFestival = dataFimFestival;
    }

    public void setRecintoFestival(Recinto recintoFestival) {
        this.recintoFestival = recintoFestival;
    }

    public boolean valida() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Festival other = (Festival) obj;
        return this.referenciaFestival == other.referenciaFestival
                && this.designacaoFestival.equalsIgnoreCase(other.designacaoFestival)
                && this.entidadeColaboradora.equals(other.entidadeColaboradora)
                && this.edicaoFestival.equalsIgnoreCase(other.designacaoFestival)
                && this.dataInicioFestival.equals(other.dataInicioFestival)
                && this.dataFimFestival.equals(other.dataFimFestival)
                && this.recintoFestival.equals(other.recintoFestival);
    }

    @Override
    public String toString() {
        return "Festival{" + "referenciaFestival=" + referenciaFestival + ", designacaoFestival=" + designacaoFestival + ", entidadeColaboradora=" + entidadeColaboradora + ", edicaoFestival=" + edicaoFestival + ", dataInicioFestival=" + dataInicioFestival + ", dataFimFestival=" + dataFimFestival + ", recintoFestival=" + recintoFestival + '}';
    }

}
