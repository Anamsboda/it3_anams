/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Festival;
import model.GestFest;

/**
 *
 * @author GRUPO 10
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class ConsultarInformacaoFestivalController {

    private final GestFest empresa;
    private Festival festival;

    public ConsultarInformacaoFestivalController(GestFest empresa) {
        this.empresa = empresa;
    }

    public void procurarFestival(String festival) {
        this.festival = empresa.procurarFestival(festival);
    }

    public String getInformacaoFestivalAsString() {
        return this.festival.toString();
    }
}
