package controller;

import java.util.ArrayList;
import model.Entidade;
import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @author grupo10
 */

public class RegistarEntidadeController {

    private final GestFest empresa;
    private Entidade entidade;

    public RegistarEntidadeController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novaEntidade() {
        this.entidade = empresa.novaEntidade();
    }

    public int getReferencia() {
        return this.entidade.getReferencia();
    }

    public String getDesignacao() {
        return this.entidade.getDesignaçao();
    }

    public ArrayList<TipoEntidade> getTipoEntidade() {
        return this.entidade.getTipoEntidade();
    }

    public void setReferencia(int referencia) {
        this.entidade.setReferencia(referencia);
    }

    public void setDesignacao(String designacao) {
        this.entidade.setDesignaçao(designacao);
    }

    public void setTipoEntidade(ArrayList<TipoEntidade> tiposEntidade) {
        this.entidade.setTipoEntidade(tiposEntidade);
    }

    public void adicionaTipoEntidade(TipoEntidade tipoEntidade) {
        this.entidade.adicionaTipoEntidade(tipoEntidade);
    }

    public boolean registaEntidade() {
        return this.empresa.registaEntidade(this.entidade);
    }

    public String getEntidadeAsString() {
        return this.entidade.toString();
    }
}