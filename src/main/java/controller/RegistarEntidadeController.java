/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Entidade;
import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
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
