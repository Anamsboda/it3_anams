package model;

/**
 *
 * @author grupo10
 */

public class TipoBilhete {

    private String tipoBilhete;

    private static final String TIPOBILHETE_POR_OMISSAO = "tipo de bilhete não definido";

    public TipoBilhete() {
        tipoBilhete = TIPOBILHETE_POR_OMISSAO;
    }

    public TipoBilhete(String tipoBilhete) {
        this.setTipoBilhete(tipoBilhete);
    }

    public TipoBilhete(TipoBilhete tipo) {
        this.tipoBilhete = tipo.tipoBilhete;
    }

    public final void setTipoBilhete(String tipoBilhete) {
        this.tipoBilhete = tipoBilhete;
    }

    public String getTipoBilhete() {
        return tipoBilhete;
    }

    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    @Override
    public String toString() {
        return "TipoBilhete{" + "tipoBilhete=" + tipoBilhete + '}';
    }
}