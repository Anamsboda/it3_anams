/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class TipoBilhete {
    private String tipoBilhete;
    
    private static final String TIPOBILHETE_POR_OMISSAO = "tipo de bilhete não definido";
    
    public TipoBilhete(){
        tipoBilhete=TIPOBILHETE_POR_OMISSAO;
    }
    
    public TipoBilhete(String tipoBilhete){
        this.setTipoBilhete(tipoBilhete);
    }
    
    public TipoBilhete(TipoBilhete tipo){
        this.tipoBilhete=tipo.tipoBilhete;
    }
    
    public final void setTipoBilhete(String tipoBilhete){
        this.tipoBilhete=tipoBilhete;
    }
    
    public String getTipoBilhete(){
        return tipoBilhete;
    }
    
    public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }

    @Override
    public String toString() {
        return "TipoBilhete{" + "tipoBilhete=" + tipoBilhete + '}';
    }
    
    
}
