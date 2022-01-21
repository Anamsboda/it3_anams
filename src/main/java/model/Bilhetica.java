package model;

import java.time.LocalDate;
import utilitarios.Utils;

/**
 *
 * @author grupo10
 */
public class Bilhetica {

    private int[][] distribuicao;
    private int[][] bilhetesVendidos;
    private float[] preco;

    public Bilhetica(Festival festival, GestFest empresa) {
        this.distribuicao = new int[festival.getNroDias()][empresa.getListaTipoBilhete().size()];
        this.bilhetesVendidos = new int[festival.getNroDias()][empresa.getListaTipoBilhete().size()];
        this.preco = new float[empresa.getListaTipoBilhete().size()];
    }

    public int[][] getDistribuicao() {
        return distribuicao;
    }

    public int[][] getBilhetesVendidos() {
        return bilhetesVendidos;
    }

    public float[] getPreco() {
        return preco;
    }

    public void setDistribuicao(int[][] distribuicao) {
        this.distribuicao = distribuicao;
    }

    public void setBilhetesVendidos(int[][] bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }

    public void setPreco(float[] preco) {
        this.preco = preco;
    }

    public int[][] obterBilhetesDisponiveis() {
        int[][] bilhetesDisponiveis = distribuicao;
        for (int i = 0; i < distribuicao.length; i++) {
            for (int j = 0; j < distribuicao[i].length; j++) {
                bilhetesDisponiveis[i][j] = bilhetesDisponiveis[i][j] - bilhetesVendidos[i][j];
            }
        }
        return bilhetesDisponiveis;
    }

    public int obterBilhetesDisponiveis(GestFest empresa, Festival festival, LocalDate dia, TipoBilhete tipoBilhete) {
        int[][] bilhetesDisponiveis = obterBilhetesDisponiveis();
        listarDiasFestival(festival);
        int escolhaDia = Utils.IntFromConsole("Introduza o número indice do dia que pretende");
        listarTipoBilhete(empresa);
        int escolhaTipoBilhete = Utils.IntFromConsole("Introduza o número de indice do tipo de bilhete que pretende");
        return bilhetesDisponiveis[escolhaDia][escolhaTipoBilhete];
    }

    public void listarDiasFestival(Festival f) {
        int contagem = 0;
        for (LocalDate lD : f.getDaysBetweenDates(f.getDataInicioFestival(), f.getDataFimFestival())) {
            System.out.println(contagem + " - " + lD.toString());
            contagem++;
        }
    }

    public void listarTipoBilhete(GestFest empresa) {
        int contagem = 0;
        for (TipoBilhete tB : empresa.getListaTipoBilhete()) {
            System.out.println(contagem + " - " + tB.toString());
            contagem++;
        }
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Bilhetica{" + "distribuicao=" + distribuicao + ", bilhetesVendidos=" + bilhetesVendidos + ", preco=" + preco + '}';
    }
}
