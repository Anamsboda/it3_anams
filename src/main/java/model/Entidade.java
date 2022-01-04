package model;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class Entidade {
    private int referencia;
    private String designacao;
    private TipoEntidade tipoEntidade;

    private static int nroEntidade = 0;
    private static final String STRING_POR_OMISSAO = "";

    public Entidade(){
        this.referencia=nroEntidade++;
        this.designacao=STRING_POR_OMISSAO;
        this.tipoEntidade=new TipoEntidade();
    }
    
    public Entidade(String designacao,TipoEntidade tipo){
        this.referencia=nroEntidade++;
        this.designacao=designacao;
        this.tipoEntidade=new TipoEntidade(tipo);
    }
    
    public Entidade(Entidade entidade){
        this.referencia=nroEntidade++;
        this.designacao=entidade.designacao;
        this.tipoEntidade=entidade.tipoEntidade;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getDesignaçao() {
        return designacao;
    }

    public TipoEntidade getTipoEntidade() {
        return tipoEntidade;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setDesignaçao(String designaçao) {
        this.designacao = designaçao;
    }

    public void setTipoEntidade(TipoEntidade tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public String toString() {
        return "Entidade{" + "referencia=" + referencia + ", designação=" + designacao + ", tipoEntidade=" + tipoEntidade + '}';
    }
    
    
}
