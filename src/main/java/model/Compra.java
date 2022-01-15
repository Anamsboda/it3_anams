package model;

import java.time.LocalDate;

/**
 *
 * @author grupox
 */

public class Compra {
    private int referencia;
    private Festival festival;
    private TipoBilhete tipoBilhete;
    private int quantidade;
    private String nome;
    private int NIF;
    private String email;
    private LocalDate dataCompra;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "N.D.";

    private final int contador = 0;

    public Compra() {
        this.referencia += contador;
        this.festival = new Festival();
        this.tipoBilhete = new TipoBilhete();
        this.quantidade = INT_DEFAULT;
        this.nome = STR_DEFAULT;
        this.NIF = INT_DEFAULT;
        this.email = STR_DEFAULT;
        this.dataCompra = LocalDate.now();
    }

    public Compra(Festival festival, TipoBilhete tipoBilhete, int quantidade, String nome, int NIF, String email, LocalDate dataCompra) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.tipoBilhete = new TipoBilhete(tipoBilhete);
        this.quantidade = quantidade;
        this.nome = nome;
        this.NIF = NIF;
        this.email = email;
        this.dataCompra = LocalDate.now();
    }

    public Compra(Compra c) {
        this.referencia = c.contador;
        this.festival = c.festival;
        this.tipoBilhete = c.tipoBilhete;
        this.quantidade = c.quantidade;
        this.nome = c.nome;
        this.NIF = c.NIF;
        this.email = c.email;
        this.dataCompra = c.dataCompra;
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public TipoBilhete getTipoBilhete() {
        return tipoBilhete;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getNIF() {
        return NIF;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public int getContador() {
        return contador;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setTipoBilhete(TipoBilhete tipoBilhete) {
        this.tipoBilhete = tipoBilhete;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Compra{" + "referencia=" + referencia + ", festival=" + festival + ", tipoBilhete=" + tipoBilhete + ", quantidade=" + quantidade + ", nome=" + nome + ", NIF=" + NIF + ", email=" + email + ", dataCompra=" + dataCompra + ", contador=" + contador + '}';
    }
}