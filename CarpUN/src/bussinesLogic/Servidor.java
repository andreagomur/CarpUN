/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

import data.Ruta;
import data.RutaConductor;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Servidor {
    
    
    
    
    public ArrayList<RutaConductor> buscarViaje(Ruta d, ArrayList<RutaConductor> f){
    ArrayList<RutaConductor> g = new ArrayList<>();
    for(RutaConductor rc : f){
    if(rc.getDestino().equals(d.getDestino()) 
            && rc.getOrigen().equals(d.getOrigen()) 
            && rc.getPuestos()==d.getPuestos()
            && rc.isDesvio() == d.isDesvio()){
        g.add(rc);   
    }
    }
    
    
    
    
    
    
    return g;
    }
    
    
}
