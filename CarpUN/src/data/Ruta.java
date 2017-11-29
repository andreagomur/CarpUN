/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author acer
 */
public class Ruta {
    private String origen;
    private String destino;
    private String horaSalida;
    private boolean desvio;
    private int puestos;
    private String ruta;
    
    public Ruta(String origen, String destino, String horaSalida, boolean desvio, int puestos, String ruta){
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.desvio = desvio;
        this.puestos = puestos;
        this.ruta = ruta;
    }
    
    public boolean getDesvio() {
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
        return this.origen;
    }

    public void setOrigen(String Origen) {
        this.origen = Origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String Destino) {
        this.destino = Destino;
    }

    public String getHoraDeSalida() {
        return this.horaSalida;
    }

    public String setHoraDeSalida(String HoraDeSalida) {
        return this.horaSalida = HoraDeSalida;
    }
    
    public void setRuta(String ruta){
        this.ruta = ruta;        
    }
    
    public String getRuta(){
        return this.ruta;
    }
}
