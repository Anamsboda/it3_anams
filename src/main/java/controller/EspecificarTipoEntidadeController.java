package controller;

import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @author grupo10
 */

public class EspecificarTipoEntidadeController {

    private final GestFest empresa;
    private TipoEntidade tipoEntidade;

    public EspecificarTipoEntidadeController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novoTipoEntidade() {
        this.tipoEntidade = empresa.novoTipoEntidade();
    }

    public void setDesignacao(String designacao) {
        this.tipoEntidade.setDesignacao(designacao);
    }

    public String getDesign() {
        return this.tipoEntidade.getDesignacao();
    }

    public boolean registaTipoEntidade() {
        return this.empresa.registaTipoEntidade(this.tipoEntidade);
    }

    public String getTipoEntidadeAsString() {
        return this.tipoEntidade.toString();
    }
}