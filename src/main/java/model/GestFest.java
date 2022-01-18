package model;

import Interface.IDescontavel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @actor grupo10
 */
public class GestFest {

    private final List<Artista> lstArtistas;
    private final List<Festival> lstFestivais;
    private final List<TipoEntidade> lstTiposEntidade;
    private final List<Entidade> lstEntidades;
    private final List<TipoBilhete> lstTiposBilhete;
    private final List<Recinto> lstRecintos;
    private final List<Localizacao> lstLocalizacoes;
    private final List<Palco> lstPalcos;
    private String designacao;
    private List<Compra> arrVB;
    private List<IDescontavel> arrDescontos;

    public GestFest(String designacao) {
        this.designacao = designacao;
        this.lstArtistas = new ArrayList<>();
        this.lstTiposEntidade = new ArrayList<>();
        this.lstFestivais = new ArrayList<>();
        this.lstEntidades = new ArrayList<>();
        this.lstTiposBilhete = new ArrayList<>();
        this.lstRecintos = new ArrayList<>();
        this.lstLocalizacoes = new ArrayList<>();
        this.lstPalcos = new ArrayList<>();
        adicionarDescontoFamilia();
        adicionarDescontoGrupo();
        arrVB = new ArrayList<Compra>();
    }

    private boolean adicionaTipoEntidade(TipoEntidade tipo) {
        return lstTiposEntidade.add(tipo);
    }

    private boolean adicionaFestival(Festival festival) {
        return lstFestivais.add(festival);
    }

    private boolean adicionaEntidade(Entidade entidade) {
        return lstEntidades.add(entidade);
    }

    private boolean adicionaTipoBilhete(TipoBilhete tipo) {
        return lstTiposBilhete.add(tipo);
    }

    private boolean adicionaRecinto(Recinto recinto) {
        return lstRecintos.add(recinto);
    }

    private boolean adicionaLocalizacao(Localizacao localizacao) {
        return lstLocalizacoes.add(localizacao);
    }

    private boolean adicionaPalco(Palco palco) {
        return lstPalcos.add(palco);
    }

    private void adicionarDescontoFamilia() {
        IDescontavel desc = DescontoFamilia.getinstance();
        arrDescontos.add(desc);
    }

    private void adicionarDescontoGrupo() {
        IDescontavel desc = DescontoGrupo.getinstance();
        arrDescontos.add(desc);
    }

    public List<TipoEntidade> getListaTipoEntidades() {
        return this.lstTiposEntidade;
    }

    public List<Recinto> getListaRecintos() {
        return this.lstRecintos;
    }

    public List<Palco> getListaPalcos() {
        return this.lstPalcos;
    }

    public TipoEntidade novoTipoEntidade() {
        return new TipoEntidade();
    }

    public Festival novoFestival() {
        return new Festival();
    }

    public Entidade novaEntidade() {
        return new Entidade();
    }

    public TipoBilhete novoTipoBilhete() {
        return new TipoBilhete();
    }

    public Recinto novoRecinto() {
        return new Recinto();
    }

    public Localizacao novaLocalizacao() {
        return new Localizacao();
    }

    public Palco novoPalco() {
        return new Palco();
    }

    // Validação global
    public boolean valida(TipoEntidade tipo) {
        boolean bRet = false;
        if (tipo.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(Festival festival) {
        boolean bRet = false;
        if (festival.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(Entidade entidade) {
        boolean bRet = false;
        if (entidade.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(TipoBilhete tipoBilhete) {
        boolean bRet = false;
        if (tipoBilhete.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(Recinto recinto) {
        boolean bRet = false;
        if (recinto.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(Localizacao localizacao) {
        boolean bRet = false;
        if (localizacao.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean valida(Palco palco) {
        boolean bRet = false;
        if (palco.valida()) {
            // Escrever aqui o código de validação

            //
            bRet = true;
        }
        return bRet;
    }

    public boolean registaTipoEntidade(TipoEntidade tipo) {
        if (this.valida(tipo)) {
            return adicionaTipoEntidade(tipo);
        }
        return false;
    }

    public boolean registaFestival(Festival festival) {
        if (this.valida(festival)) {
            return adicionaFestival(festival);
        }
        return false;
    }

    public boolean registaEntidade(Entidade entidade) {
        if (this.valida(entidade)) {
            return adicionaEntidade(entidade);
        }
        return false;
    }

    public boolean registaTipoBilhete(TipoBilhete tipoBilhete) {
        if (this.valida(tipoBilhete)) {
            return adicionaTipoBilhete(tipoBilhete);
        }
        return false;
    }

    public boolean registaRecinto(Recinto recinto) {
        if (this.valida(recinto)) {
            return adicionaRecinto(recinto);
        }
        return false;
    }

    public boolean registaLocalizacao(Localizacao localizacao) {
        if (this.valida(localizacao)) {
            return adicionaLocalizacao(localizacao);
        }
        return false;
    }

    public boolean registaPalco(Palco palco) {
        if (this.valida(palco)) {
            return adicionaPalco(palco);
        }
        return false;
    }

    public Festival procurarFestivalDesgn(String festival) {
        for (Festival f : lstFestivais) {
            if (f.getDesignacaoFestival().equals(festival)) {
                return f;
            }
        }
        return null;
    }

    public Recinto procurarRecinto(int codigoRecinto) {
        Recinto recinto = new Recinto();
        for (Recinto r : lstRecintos) {
            if (codigoRecinto == r.getCodigoRecinto()) {
                recinto = r;
            }
        }
        return recinto;
    }

    public Artista procurarArtista(String nome) {
        Artista artista = new Artista();
        for (Artista a : lstArtistas) {
            if (nome.equalsIgnoreCase(a.getNome())) {
                artista = a;
            }
        }
        return artista;
    }

    public Entidade procurarEntidade(int referencia) {
        for (Entidade e : lstEntidades) {
            if (e.getReferencia() == referencia) {
                return e;
            }
        }
        return new Entidade();
    }

    public String getFestivaisAsString() {
        String festivaisString = "N.D.";
        for (Festival f : lstFestivais) {
            festivaisString += f.toString();
        }
        return festivaisString;
    }

    public String getTiposBilheteAsString() {
        String TipoBilheteString = "N.D.";
        for (TipoBilhete tb : lstTiposBilhete) {
            TipoBilheteString += tb.toString();
        }
        return TipoBilheteString;
    }
}
