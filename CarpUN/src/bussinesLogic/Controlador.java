/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

import data.Conductor;
import data.Pasajero;
import data.Usuario;
import ui.Principal;

/**
 *
 * @author acer
 */
public class Controlador {
    private Pasajero p;
    private Conductor c;
    private Usuario u;
    
    public Pasajero getPasajero() {
        return p;
    }

    public void setPasajero(Pasajero p) {
        this.p = p;
    }

    public Conductor getConductor() {
        return c;
    }

    public void setCconductor(Conductor c) {
        this.c = c;
    }

    public Usuario getUsuario() {
        return u;
    }

    public void setUsuario(Usuario u) {
        this.u = u;
    }
    
    public void addUsuarioConductor(Conductor d){
    this.c = d;
    this.u = this.c;
    }
}
