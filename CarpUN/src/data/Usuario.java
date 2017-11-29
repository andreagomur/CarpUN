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
public class  Usuario {
// Atributos
    protected String nombre;
    private long documento;
    protected String universidad;
    private String direccion;
    private long telefono;
    private String tipoUsuario;
    //protected ArrayList<Viaje> Historial;
    protected File info;
    
// Construcctor

    public Usuario(String Nombre, long Documento, String universidad, String direccion, long telefono, String tipoUsuario) {
        this.nombre = Nombre;
        this.documento = Documento;

        this.universidad = universidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
        //this.Historial = new ArrayList<>();
        //String a = Documento +".txt";
        //this.info = new File(a);  // contiene toda la informacion del usuario.
        //this.info.createNewFile(); // insertar try catch.
    }
    
// Getters
    public String getNombre() {
        return this.nombre;
    }

    public long getDocumento() {
        return this.documento;
    }

    public String getUniversidad() {
        return this.universidad;
    }

    public String getDireccion() {
        return this.direccion;
    }
    
    public long getTelefono(){
        return this.telefono;
    }
    
    public String getTipoUsuario(){
        return this.tipoUsuario;
    }
    
}
