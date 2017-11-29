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
public class Direccion {
// Atributos
    private String direccion;
    private Usuario owner;
// Constructor

    public Direccion(String direccion, Usuario owner) {
        this.direccion = direccion;
        this.owner = owner;
    }
    
// Getters 

    public String getDireccion() {
        return direccion;
    }

    public Usuario getOwner() {
        return owner;
    }
    
}
