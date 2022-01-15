package model;

/**
 *
 * @author grupo10
 */

public class TipoEntidade {
    private String designacao;

    private static final String DESIGN_POR_OMISSAO = "sem designação";

    public TipoEntidade() {
        designacao = DESIGN_POR_OMISSAO;
    }

    public TipoEntidade(String design) {
        this.setDesignacao(designacao);
    }

    public TipoEntidade(TipoEntidade tipo) {
        this.designacao = tipo.designacao;
    }

    public final void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Designação: " + designacao + "\n");
        return sb.toString();
    }
}