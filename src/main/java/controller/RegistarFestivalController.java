/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.Festival;
import model.GestFest;
import model.Recinto;
import utilitarios.Data;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class RegistarFestivalController {
    private final GestFest empresa;
    private Festival festival;
    
    public RegistarFestivalController(GestFest empresa){
        this.empresa=empresa;
    }
    
    public void novoFestival(){
        this.festival=empresa.novoFestival();
    }
    
    public String getDesignacao(){
        return this.festival.getDesignacaoFestival();
    }
    
    public String getEdicaoFestival(){
        return this.festival.getEdicaoFestival();
    }
    
    public Date getDataInicioFestival(){
        return this.festival.getDataInicioFestival();
    }
    
    public Date getDataFimFestival(){
        return this.festival.getDataFimFestival();
    }
    
    public Recinto getRecintoFestival(){
        return new Recinto(this.festival.getRecintoFestival());
    }
    
    public void setDesignacao(String designacao){
        this.festival.setDesignacaoFestival(designacao);
    }
    
    public void setEdicaoFestival(String edicao){
        this.festival.setEdicaoFestival(edicao);
    }
    
    public void setDataInicioFestival(Date dataInicio){
        this.festival.setDataInicioFestival(dataInicio);
    }
    
    public void setDataFimFestival(Date dataFim){
        this.festival.setDataFimFestival(dataFim);
    }
    
    public void setRecintoFestival(Recinto recinto){
        this.festival.setRecintoFestival(recinto);
    }
    
    public boolean registaFestival(){
        return this.empresa.registaFestival(this.festival);
    }
    
    public String getFestivalAsString(){
        return this.festival.toString();
    }
}
