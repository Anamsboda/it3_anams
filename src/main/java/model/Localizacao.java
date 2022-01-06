/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * GRUPO 10
 *
 * @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 * @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 * <@!774356880800743434> PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class Localizacao {

    private String pais;
    private String cidade;
    private String rua;
    private String codigo_postal;

    private static final String STRING_POR_OMISSAO = "";

    public Localizacao() {
        this.pais = STRING_POR_OMISSAO;
        this.cidade = STRING_POR_OMISSAO;
        this.rua = STRING_POR_OMISSAO;
        this.codigo_postal = STRING_POR_OMISSAO;
    }

    public Localizacao(String pais, String cidade, String rua, String codigo_postal) {
        this.pais = pais;
        this.cidade = cidade;
        this.rua = rua;
        this.codigo_postal = codigo_postal;
    }

    public Localizacao(Localizacao localizacao) {
        this.pais = localizacao.pais;
        this.cidade = localizacao.cidade;
        this.rua = localizacao.rua;
        this.codigo_postal = localizacao.codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "pais=" + pais + ", cidade=" + cidade + ", rua=" + rua + ", codigo_postal=" + codigo_postal + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Localizacao other = (Localizacao) obj;
        return this.pais.equalsIgnoreCase(other.pais)
                && this.cidade.equalsIgnoreCase(other.cidade)
                && this.rua.equalsIgnoreCase(other.rua)
                && this.codigo_postal.equalsIgnoreCase(other.codigo_postal);
    }
}
