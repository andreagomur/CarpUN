/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArchivos;

import data.Ruta;
import data.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class EscritorArchivos {

    public void escribirArchivo(ArrayList<String> entradas, String rutaArchivo){
        BufferedWriter writerInv=null;
        try {
        writerInv = new BufferedWriter(new FileWriter(rutaArchivo,false));
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        
        for (int i=0;i<entradas.size();i++){
            try {
            writerInv.write(entradas.get(i));            
            writerInv.newLine();
        }catch (IOException ex) {
            ex.printStackTrace();
        }                           
        }
        
        try {        
            writerInv.close();
        } catch (IOException ex) {
            Logger.getLogger(EscritorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void agregarUsuario(Usuario usuario, String rutaArchivo, String tipoUsuario){
        ArrayList<String> entradasArchivo = new ArrayList<String>();
        LectorArchivos la = new LectorArchivos();
        
        entradasArchivo = la.leerArchivo(rutaArchivo);        
        entradasArchivo.add(usuario.getNombre() + "%" + usuario.getUniversidad() + "%" + usuario.getTelefono() + "%" + usuario.getDocumento() + "%" + usuario.getDireccion() + "%" + tipoUsuario );        
        escribirArchivo(entradasArchivo, rutaArchivo);
        
    }
    
    public void agregarRuta(Ruta ruta, String rutaArchivo, float precio){
        ArrayList<String> entradasArchivo = new ArrayList<String>();
        LectorArchivos la = new LectorArchivos();        
        entradasArchivo = la.leerArchivo(rutaArchivo);        
        
        entradasArchivo.add(ruta.getOrigen() + "%" + ruta.getDestino() + "%" + ruta.getRuta() + "%" + ruta.getDesvio() + "%" + ruta.getPuestos() + "%" + precio + "%" + ruta.getHoraDeSalida() + "%" + ruta.getId() + "%" + ruta.getTelefono() + "%" + ruta.getConductor());               
        escribirArchivo(entradasArchivo, rutaArchivo);        
    }
    
}