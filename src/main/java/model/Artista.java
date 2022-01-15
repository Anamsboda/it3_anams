package model;

/**
 *
 * @author grupox
 */

public class Artista {
    private int codigo;
    private String email;
    private String nome;
    private String nroContribuinte;
    private String nroTelemovel;

    private static int nroArtista = 0;
    private static final String STRING_POR_OMISSAO = "";

    public Artista() {
        this.codigo = nroArtista++;
        this.email = STRING_POR_OMISSAO;
        this.nome = STRING_POR_OMISSAO;
        this.nroContribuinte = STRING_POR_OMISSAO;
        this.nroTelemovel = STRING_POR_OMISSAO;
    }

    public Artista(String email, String nome, String nroContribuinte, String nroTelemovel) {
        this.codigo = nroArtista++;
        this.email = email;
        this.nome = nome;
        this.nroContribuinte = nroContribuinte;
        this.nroTelemovel = nroTelemovel;
    }

    public Artista(Artista artista) {
        this.codigo = nroArtista++;
        this.email = artista.email;
        this.nome = artista.nome;
        this.nroContribuinte = artista.nroContribuinte;
        this.nroTelemovel = artista.nroTelemovel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getNroContribuinte() {
        return nroContribuinte;
    }

    public String getNroTelemovel() {
        return nroTelemovel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNroContribuinte(String nroContribuinte) {
        this.nroContribuinte = nroContribuinte;
    }

    public void setNroTelemovel(String nroTelemovel) {
        this.nroTelemovel = nroTelemovel;
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Artista{" + "email=" + email + ", nome=" + nome + ", nroContribuinte=" + nroContribuinte + ", nroTelemovel=" + nroTelemovel + '}';
    }
}