/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public abstract class  Usuario {
// Atributos
    protected String Nombre;
    private int Documento;
    protected Universidad universidad;
    private Direccion direccion;
    protected ArrayList<Viaje> Historial;
    protected File info;
    
// Construcctor

    public Usuario(String Nombre, int Documento, Universidad universidad, String direccion) throws IOException {
        this.Nombre = Nombre;
        this.Documento = Documento;

        this.universidad = universidad;
        this.direccion = new Direccion(direccion, this);
        this.Historial = new ArrayList<>();
        String a = Documento +".txt";
        this.info = new File(a);  // contiene toda la informacion del usuario.
        this.info.createNewFile(); // insertar try catch.
    }
    
// Getters
    public ArrayList<Viaje> getHistorial() {
        return Historial;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDocumento() {
        return Documento;
    }



    public Universidad getUniversidad() {
        return universidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
// Metodos
  public abstract void SolicitarViaje(String Categoria);

  public  abstract void finalizarViaje();
  
  public abstract File getInfo();
}
