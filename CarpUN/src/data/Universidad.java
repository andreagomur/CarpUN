/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public class Universidad {
// Atributos 
    private String Nombre;
    private ArrayList<Usuario> usuarios;
// Getters

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
}
