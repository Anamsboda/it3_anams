package controller;

import model.Bilhetica;
import model.Festival;
import model.GestFest;

/**
 *
 * @author grupo10
 */

public class RegistarPlaneamentoBilheticaController {
    private final GestFest empresa;
    private Bilhetica bilhetica;
    private Festival festival;

    public RegistarPlaneamentoBilheticaController(GestFest empresa){
        this.empresa = empresa;
    }

    public void novaBilhetica(Festival festival){
        this.bilhetica = festival.novaBilhetica(festival,empresa);
    }

    public void procurarFestival(int referencia){
        this.festival = empresa.procurarFestivalRef(referencia);
    }

    public GestFest getEmpresa(){
        return this.empresa;
    }

    public Festival getFestival(){
        return this.festival;
    }

    public Bilhetica getBilhetica(){
        return this.bilhetica;
    }

    public String getBilheticaAsString(){
        return this.bilhetica.toString();
    }

    public boolean adicionarBilhetesBilhetica(int i,int j,int nB){
        for (int k = 0; k < this.bilhetica.getDistribuicao().length; k++) {
            if(k==i){
                for (int l = 0; l < this.bilhetica.getDistribuicao()[k].length; l++) {
                    if(l==j){
                        this.bilhetica.getDistribuicao()[k][l] = nB;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean registaBilhetica(){
        return this.festival.registaBilhetica(this.bilhetica);
    }

    public void listarFestivaisAsString(){
        empresa.getFestivaisAsString();
    }
}