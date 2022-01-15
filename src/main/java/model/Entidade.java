package model;

import java.util.ArrayList;

/**
 *
 * @author grupo10
 */

public class Entidade {
    private int referencia;
    private String designacao;
    private ArrayList<TipoEntidade> tiposEntidade;

    private static int nroEntidade = 0;
    private static final String STRING_POR_OMISSAO = "";

    public Entidade() {
        this.referencia = nroEntidade++;
        this.designacao = STRING_POR_OMISSAO;
        this.tiposEntidade = new ArrayList<TipoEntidade>();
    }

    public Entidade(String designacao) {
        this.referencia = nroEntidade++;
        this.designacao = designacao;
        this.tiposEntidade = new ArrayList<TipoEntidade>();
    }

    public Entidade(Entidade entidade) {
        this.referencia = nroEntidade++;
        this.designacao = entidade.designacao;
        this.tiposEntidade = entidade.tiposEntidade;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getDesignaçao() {
        return designacao;
    }

    public ArrayList<TipoEntidade> getTipoEntidade() {
        return tiposEntidade;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setDesignaçao(String designaçao) {
        this.designacao = designaçao;
    }

    public void setTipoEntidade(ArrayList<TipoEntidade> tiposEntidade) {
        this.tiposEntidade = tiposEntidade;
    }

    public void adicionaTipoEntidade(TipoEntidade tipoEntidade) {
        this.tiposEntidade.add(tipoEntidade);
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Entidade{" + "referencia=" + referencia + ", designação=" + designacao + ", tipoEntidade=" + tiposEntidade + '}';
    }
}