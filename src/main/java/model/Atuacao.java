
package model;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author grupox
 */

public class Atuacao {
    private int codigo;
    private Artista artista;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Duration duracao;
    private Palco palco;

    private static int nroAtuacao = 0;
    private static final int INT_POR_OMISSAO = 0;

    public Atuacao() {
        this.codigo = nroAtuacao++;
        this.artista = new Artista();
        this.dataInicio = LocalDateTime.now();
        this.dataFim = LocalDateTime.now();
        this.duracao = Duration.ZERO;
        this.palco = new Palco();
    }

    public Atuacao(Artista artista, LocalDateTime dataInicio, LocalDateTime dataFim, Duration duracao, Palco palco) {
        this.codigo = nroAtuacao++;
        this.artista = new Artista(artista);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.duracao = duracao;
        this.palco = new Palco(palco);
    }

    public Atuacao(Atuacao atuacao) {
        this.codigo = nroAtuacao++;
        this.artista = atuacao.artista;
        this.dataInicio = atuacao.dataInicio;
        this.dataFim = atuacao.dataFim;
        this.duracao = atuacao.duracao;
        this.palco = atuacao.palco;
    }

    public int getCodigo() {
        return codigo;
    }

    public Artista getArtista() {
        return artista;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Palco getPalco() {
        return palco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setArtista(Artista artista) {
        this.artista = new Artista(artista);
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public void setPalco(Palco palco) {
        this.palco = new Palco(palco);
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Atuacao{" + "codigo=" + codigo + ", artista=" + artista + ", dataInicio=" + dataInicio + ", duracao=" + duracao + ", palco=" + palco + '}';
    }
}