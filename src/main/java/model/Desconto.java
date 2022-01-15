package model;

/**
 *
 * @author grupox
 */

public class Desconto {
    private int codigo;
    private String sigla;
    private String descricao;
    private int valorDesconto;
    private int nroMinPessoas;

    private static int nroDesconto = 0;
    private static final int INT_POR_OMISSAO = 0;
    private static final String STRING_POR_OMISSAO = "";

    public Desconto() {
        this.codigo = nroDesconto++;
        this.sigla = STRING_POR_OMISSAO;
        this.descricao = STRING_POR_OMISSAO;
        this.valorDesconto = INT_POR_OMISSAO;
        this.nroMinPessoas = INT_POR_OMISSAO;
    }

    public Desconto(String sigla, String descricao, int valorDesconto, int nroMinPessoas) {
        this.codigo = nroDesconto++;
        this.sigla = sigla;
        this.descricao = descricao;
        this.valorDesconto = valorDesconto;
        this.nroMinPessoas = nroMinPessoas;
    }

    public Desconto(Desconto desconto) {
        this.codigo = nroDesconto++;
        this.sigla = desconto.sigla;
        this.descricao = desconto.descricao;
        this.valorDesconto = desconto.valorDesconto;
        this.nroMinPessoas = desconto.nroMinPessoas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public int getNroMinPessoas() {
        return nroMinPessoas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setNroMinPessoas(int nroMinPessoas) {
        this.nroMinPessoas = nroMinPessoas;
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Desconto{" + "codigo=" + codigo + ", sigla=" + sigla + ", descricao=" + descricao + ", valorDesconto=" + valorDesconto + ", nroMinPessoas=" + nroMinPessoas + '}';
    }
}