/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Entidade;
import model.Festival;
import model.GestFest;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class AssociarEntidadeFestivalController {
    private GestFest gestfest;
    private Festival festival;
    private Entidade entidade;

    private GestFest empresa;

    public AssociarEntidadeFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void consultaFestival(String festival) {
        this.festival = gestfest.procurarFestival(festival);
    }

    public void consultaEntidade(int referencia) {
        this.entidade = gestfest.procurarEntidade(referencia);
    }

    public boolean associarFestivalEntidade(){
        ArrayList<Entidade> e = this.festival.getEntidadeColaboradora();
        e.add(entidade);
        this.festival.setEntidadeColaboradora(e);
        return true;
    }

    public String getFestivalAsString(){
        return this.festival.toString();
    }

    public String getEntidadeAsString(){
        return this.entidade.toString();
    }
}
