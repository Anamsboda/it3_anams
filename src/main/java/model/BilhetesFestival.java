/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @a
 */
public class BilhetesFestival {

    private int referencia;
    private String designacao;
    private TipoBilhete tipo;
    private int preco;
    private LocalDate data;
    private int quantidade;
    private float desconto;
    private Festival festival;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public BilhetesFestival() {
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.tipo = new TipoBilhete();
        this.preco = INT_DEFAULT;
        this.data = LocalDate.now();
        this.quantidade = INT_DEFAULT;
        this.desconto = FLOAT_DEFAULT;
        this.festival = new Festival();
    }

    public BilhetesFestival(String designacao, TipoBilhete tipo, int preco, LocalDate data, int quantidade, float desconto, Festival festival) {
        this.referencia = ++contador;
        this.designacao = designacao;
        this.tipo = tipo;
        this.preco = preco;
        this.data = data;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.festival = new Festival(festival);
    }

    public BilhetesFestival(BilhetesFestival bilheteFestival) {
        this.referencia = bilheteFestival.referencia;
        this.designacao = bilheteFestival.designacao;
        this.tipo = bilheteFestival.tipo;
        this.preco = bilheteFestival.preco;
        this.data = bilheteFestival.data;
        this.quantidade = bilheteFestival.quantidade;
        this.desconto = bilheteFestival.desconto;
        this.festival = bilheteFestival.festival;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public TipoBilhete getTipo() {
        return tipo;
    }

    public void setTipo(TipoBilhete tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    @Override
    public String toString() {
        return "BilhetesFestival{" + "referencia=" + referencia + ", designacao=" + designacao + ", tipo=" + tipo + ", preco=" + preco + ", data=" + data + ", quantidade=" + quantidade + ", desconto=" + desconto + '}';
    }

}
