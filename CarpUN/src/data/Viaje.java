/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public abstract class Viaje {
// Atributos
    private int id;
    private Conductor conductor;
    private Pasajero[] pasajeros;
    protected int cuposLlenos;
    private boolean Estado; // True : viaje consolidado (Se guarda en el historial), false : viaje no saldado (Se elimina)
    private String horaSalida;
    private int Cantidad;
    
// Constructor
    public Viaje(Conductor conductor, String horaSalida, int cantidad) {
        this.conductor = conductor;
        this.horaSalida = horaSalida;
        this.Estado = false;
        this.id = 1; // hay que hacer algo para que se cree un  id por defecto
        this.pasajeros = new Pasajero[cantidad];
        this.cuposLlenos = 0;
        this.Cantidad = cantidad;
    }
    
// Getters 
    public int getId() {
        return id;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public boolean isEstado() {
        return Estado;
    }

    public String getHoraSalida() {
        return horaSalida;
    }
// Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
// Metodos
    
   public void addPasajeros(Pasajero pasajero){
   this.pasajeros[this.cuposLlenos] = pasajero;
   this.cuposLlenos++;
   }
   
   public boolean verificarCuposDisponibles(){
   if(this.cuposLlenos < this.Cantidad ){
   return true;
   }else{
   return false;
   }
   }
}
