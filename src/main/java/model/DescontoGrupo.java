/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Interface.IDescontavel;
import utilitarios.Utils;

/**
 *
 * @author andre
 */
public class DescontoGrupo implements IDescontavel{

    private static DescontoGrupo desconto;
    private int codigo;
    private String sigla;
    private String descricao;
    private float perc;
    private int numMinPessoas;

    private static final int CODIGO = 1;
    private static final String SIGLA = "Grupo";
    private static final String DESCRICAO = "Este desconto aplica-se a grupos, tem que ter no mínimo 7 pessoas.";
    private static final float PERC = 0.10f;
    private static final int MINIMOPESSOAS = 7;

    public DescontoGrupo() {
        this.codigo = CODIGO;
        this.sigla = SIGLA;
        this.descricao = DESCRICAO;
        this.perc = PERC;
        this.numMinPessoas = MINIMOPESSOAS;
    }
    
    public static synchronized DescontoGrupo getinstance() {
        if (desconto == null) {
            desconto = new DescontoGrupo();
        }
        return desconto;
    }

    public float obterDesconto(int qtd) {
        //int qtd = Utils.IntFromConsole("Introduza o número de bilhetes");
        if (qtd >= MINIMOPESSOAS) {
            return this.perc;
        }
        return 0;
    }
}
