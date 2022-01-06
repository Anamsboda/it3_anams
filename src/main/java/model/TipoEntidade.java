/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * GRUPO 10
 *
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class TipoEntidade {

    private String designacao;

    private static final String DESIGN_POR_OMISSAO = "sem designação";

    public TipoEntidade() {
        designacao = DESIGN_POR_OMISSAO;
    }

    public TipoEntidade(String design) {
        this.setDesignacao(designacao);
    }

    public TipoEntidade(TipoEntidade tipo) {
        this.designacao = tipo.designacao;
    }

    public final void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Designação: " + designacao + "\n");
        return sb.toString();
    }

}
