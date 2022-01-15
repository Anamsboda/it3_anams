package controller;

import model.GestFest;
import model.TipoBilhete;

/**
 *
 * @author grupo10
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