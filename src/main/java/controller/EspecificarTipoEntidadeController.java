/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
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
