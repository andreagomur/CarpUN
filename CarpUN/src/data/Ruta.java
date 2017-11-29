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
    private float precio;
    private String id;
    private long telefono;
    private String conductor;
    
    public Ruta(String origen, String destino, String horaSalida, boolean desvio, int puestos, String ruta, float precio, String id, long telefono, String conductor){
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.desvio = desvio;
        this.puestos = puestos;
        this.ruta = ruta;
        this.precio = precio;
        this.id = id;
        this.telefono = telefono;
        this.conductor = conductor;
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

    public String setHoraSalida(String HoraDeSalida) {
        return this.horaSalida = HoraDeSalida;
    }
    
    public void setRuta(String ruta){
        this.ruta = ruta;        
    }
    
    public String getRuta(){
        return this.ruta;
    }
    
    public float getPrecio(){
        return this.precio;
    }
 
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public long getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }
    
    public String getConductor(){
        return this.conductor;                
    }
    
    public void setConductor(String conductor){
        this.conductor = conductor;                 
    }
}
