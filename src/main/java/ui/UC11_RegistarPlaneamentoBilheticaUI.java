/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.RegistarPlaneamentoBilheticaController;
import java.time.LocalDate;
import model.Festival;
import model.GestFest;
import model.RegistoFestivais;
import utilitarios.Utils;


public class UC11_RegistarPlaneamentoBilheticaUI {
    private GestFest empresa;
    private RegistarPlaneamentoBilheticaController controller;
    
    public UC11_RegistarPlaneamentoBilheticaUI(GestFest empresa){
        this.empresa = empresa;
        controller = new RegistarPlaneamentoBilheticaController(empresa);
    }
    
    public void run(){ 
        controller.listarFestivaisAsString();
        controller.procurarFestival(Utils.IntFromConsole("Introduza o codigo do Festival"));
        
        
        System.out.println("\n Nova Bilhética: ");
        controller.novaBilhetica(controller.getFestival());
        
        introduzDados();
        
        apresentaDados();
        
        if(Utils.confirma("Confirma os dados? (S/N) ")){
            if(controller.registaBilhetica()){
                System.out.println("Bilhética registada com sucesso!");
            }else{
                System.out.println("Bilhética não registada");
            }
        }
    }
    
    private void introduzDados(){
        System.out.println("Siga as intruções para preencher a sua bilhética...");
        for (int i = 0; i < controller.getFestival().getNroDias(); i++) {
            System.out.println("Relativamente ao dia "+ controller.getFestival().getDaysBetweenDates(controller.getFestival().getDataInicioFestival(), controller.getFestival().getDataFimFestival()).get(i).toString()+ " ...");
            for (int j = 0; j < controller.getEmpresa().getListaTipoBilhete().size(); j++) {
                System.out.println();
                int nB = Utils.IntFromConsole("Introduza o número de bilhetes do tipo " + controller.getEmpresa().getListaTipoBilhete().get(j).toString());
                controller.adicionarBilhetesBilhetica(i,j,nB);
            }
        }
        
        System.out.println("Siga as instruções para atribuir os preços dos bilhetes:");
        for (int i = 0; i < controller.getBilhetica().getPreco().length; i++) {
            System.out.println();
            float preco = (float) Utils.IntFromConsole("Introduza o preço para o tipo de bilhete: "+controller.getEmpresa().getListaTipoBilhete().get(i).toString());
            controller.setPreco(i,preco);
        }
    }
    
    private void apresentaDados(){
        System.out.println("\nBilhética:\n" + controller.getBilheticaAsString());
    }
}