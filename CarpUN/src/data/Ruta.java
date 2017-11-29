/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author acer
 */
public abstract class Ruta {
    private String Origen;
    private String Destino;
    private String HoraDeSalida;
    private boolean desvio;
    private int puestos;
    public Ruta(){
    this.Destino = null;
    this.HoraDeSalida = null;
    this.Origen = null;
    this.desvio = false;
    this.puestos = 0;
    }

    public boolean isDesvio() {
        return desvio;
    }

    public void setDesvio(boolean desvio) {
        this.desvio = desvio;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getHoraDeSalida() {
        return HoraDeSalida;
    }

    public void setHoraDeSalida(String HoraDeSalida) {
        this.HoraDeSalida = HoraDeSalida;
    }
    
}
