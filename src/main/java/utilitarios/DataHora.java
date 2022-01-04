/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;

/**
 *
 * @author GRUPO 10
 *         @ANDRÉ FILIPE VALÉRIO CONCEIÇÃO (1200807) --->TURMA 2DA
 *         @DANIEL ALEXANDRE RIBEIRO GRAÇA (1201822) --->TURMA 2DA
 *         @RAFAEL PEREIRA MARTINS (1200698) --->TURMA 2DA
 */
public class DataHora extends Data{
    private int hora;
    private int minuto;

    private static final int INT_PREDEFINIDO = 0;

    public DataHora() {
        super();
        this.hora = INT_PREDEFINIDO;
        this.minuto = INT_PREDEFINIDO;
    }

    public DataHora(int ano, int mes, int dia, int hora, int minuto ) {
        super(ano, mes, dia);
        this.hora = hora;
        this.minuto = minuto;
    }

    public DataHora(Data data, int hora, int minuto) {
        super(data);
        this.hora = hora;
        this.minuto = minuto;
    }

    public DataHora(DataHora dh) {
        super(dh);
        this.hora = dh.hora;
        this.minuto = dh.minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DataHora other = (DataHora) obj;
        return this.hora == other.hora
                && this.minuto == other.minuto;
    }

    @Override
    public String toString() {
        return super.toString() + " às "+ hora + "H " + minuto + "M";
    }
}