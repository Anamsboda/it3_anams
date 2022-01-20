package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author grupo10
 */
public class Festival {

    private int referenciaFestival;
    private String designacaoFestival;
    private ArrayList<Entidade> entidadeColaboradora;
    private String edicaoFestival;
    private LocalDate dataInicioFestival;
    private LocalDate dataFimFestival;
    private Recinto recintoFestival;
    private HashSet<Palco> palco;
    private TipoBilhete tipoBilhete;

    private static int nroFestival = 0;

    private static final String STRING_POR_OMISSAO = "";

    public Festival() {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = STRING_POR_OMISSAO;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival = STRING_POR_OMISSAO;
        this.dataInicioFestival = LocalDate.now();
        this.dataFimFestival = LocalDate.now();
        this.recintoFestival = new Recinto();
        this.palco = new HashSet<>();
        this.tipoBilhete = new TipoBilhete();
    }

    public Festival(String designacao, String edicao, LocalDate dataInicio, LocalDate dataFimFestiva, Recinto recinto, HashSet<Palco> palco, TipoBilhete tipoBilhete) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = designacao;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival = edicao;
        this.dataInicioFestival = dataInicio;
        this.dataInicioFestival = dataFimFestival;
        this.recintoFestival = new Recinto(recinto);
        this.palco = new HashSet<Palco>(palco);
        this.tipoBilhete = new TipoBilhete(tipoBilhete);
    }

    public Festival(String designacao, ArrayList<Entidade> entidadeColaboradora, String edicao, LocalDate dataInicio, LocalDate dataFimFestival, Recinto recinto, HashSet<Palco> palco, TipoBilhete tipoBilhete) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = designacao;
        this.entidadeColaboradora = new ArrayList<>(entidadeColaboradora);
        this.edicaoFestival = edicao;
        this.dataInicioFestival = dataInicio;
        this.dataFimFestival = dataFimFestival;
        this.recintoFestival = new Recinto(recinto);
        this.palco = new HashSet<Palco>(palco);
        this.tipoBilhete = new TipoBilhete(tipoBilhete);
    }

    public Festival(Festival festival) {
        this.referenciaFestival = nroFestival++;
        this.designacaoFestival = festival.designacaoFestival;
        this.edicaoFestival = festival.edicaoFestival;
        this.dataInicioFestival = festival.dataInicioFestival;
        this.dataFimFestival = festival.dataFimFestival;
        this.recintoFestival = festival.recintoFestival;
        this.palco = festival.palco;
        this.tipoBilhete = festival.tipoBilhete;
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

    public LocalDate getDataInicioFestival() {
        return dataInicioFestival;
    }

    public LocalDate getDataFimFestival() {
        return dataFimFestival;
    }

    public Recinto getRecintoFestival() {
        return recintoFestival;
    }

    public TipoBilhete getTipoBilhete() {
        return tipoBilhete;
    }

    public HashSet<Palco> getPalco() {
        return new HashSet<>(palco);
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

    public void setDataInicioFestival(LocalDate dataInicioFestival) {
        this.dataInicioFestival = dataInicioFestival;
    }

    public void setDataFimFestival(LocalDate dataFimFestival) {
        this.dataFimFestival = dataFimFestival;
    }

    public void setRecintoFestival(Recinto recintoFestival) {
        this.recintoFestival = recintoFestival;
    }

    public void setPalco(HashSet<Palco> palco) {
        this.palco = new HashSet<>(palco);
    }

    public boolean valida() {
        return true;
    }

    public void setTipoBilhete(TipoBilhete tipoBilhete) {
        this.tipoBilhete = tipoBilhete;
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
