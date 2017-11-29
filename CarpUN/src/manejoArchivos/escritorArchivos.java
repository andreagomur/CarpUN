/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArchivos;

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
public class escritorArchivos {

public void agregarAlArchivo(Usuario usuario, String rutaArchivo){
    
        /*  1. Busca si ya existe una entrada en el archivo, de ser así, actualiza los datos
            2. Si no existe una entrada, la agrega         
        */
        
        BufferedWriter writer=null;
        FileReader fileReader=null;
        ArrayList<String> entradasArchivo = new ArrayList<String>();
        String line;

        // Lee el archivo
        try {
            fileReader = new FileReader(rutaArchivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(escritorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fileReader);
        try {                              
                while((line = br.readLine()) != null) {
                    entradasArchivo.add(line);
                    System.out.println("Entrada Inventario: " + line);
                }
        }catch (IOException ex) {
            Logger.getLogger(escritorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            fileReader.close();
        } catch (IOException ex) {
            Logger.getLogger(escritorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
                          
        boolean enArchivo=false;
            for (int j=0;j<entradasArchivo.size();j++){                                       
                    enArchivo = true;                    
                    break;                
            }            
            
            // La entrada no existe en el archivo
            if (!enArchivo){
                //entradasArchivo.add(factura.getProductos().get(i).getNombre() + " x " + Integer.toString(factura.getCantidades()[i]) +" , " + factura.getProductos().get(i).getCosto());
            }
            
            enArchivo=false;     
        
        BufferedWriter writerInv=null;
        try {
        writerInv = new BufferedWriter(new FileWriter(rutaArchivo,false));
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        
        for (int i=0;i<entradasArchivo.size();i++){
            try {
            writerInv.write(entradasArchivo.get(i));            
            writerInv.newLine();
        }catch (IOException ex) {
            ex.printStackTrace();
        }                           
        }
        
        try {        
            writerInv.close();
        } catch (IOException ex) {
            Logger.getLogger(escritorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    
}
