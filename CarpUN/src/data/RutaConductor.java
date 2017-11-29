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
public class RutaConductor extends Ruta {
 
    private String Ruta;
    private float precio;

    public RutaConductor() {
      
        this.Ruta = null;
     
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

  
    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

  
    
    
    
    
            }