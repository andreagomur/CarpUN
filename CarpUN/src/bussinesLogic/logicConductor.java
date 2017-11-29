/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

import data.Conductor;
import data.RutaConductor;
import java.util.Date;

/**
 *
 * @author acer
 */
public class logicConductor{
    private Conductor n ; 

    public logicConductor(Conductor h) {
        this.n =h;
    }
    
    public void addRutaConductor(RutaConductor t){
    this.n.setRutaConductor(t);
    }
    
    public void aceptarSolicitud(){
    
    
    }
}
