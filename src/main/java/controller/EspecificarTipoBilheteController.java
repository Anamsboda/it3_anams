/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GestFest;
import model.TipoBilhete;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class EspecificarTipoBilheteController {

    private final GestFest empresa;
    private TipoBilhete tipoBilhete;

    public EspecificarTipoBilheteController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novoTipoBilhete() {
        this.tipoBilhete = empresa.novoTipoBilhete();
    }

    public String getTipoBilhete(String tipo) {
        return this.tipoBilhete.getTipoBilhete();
    }

    public void setTipoBilhete(String tipo) {
        this.tipoBilhete.setTipoBilhete(tipo);
    }

    public boolean registaTipoBilhete() {
        return this.empresa.registaTipoBilhete(this.tipoBilhete);
    }

    public String getTipoBilheteAsString() {
        return this.tipoBilhete.toString();
    }
}
