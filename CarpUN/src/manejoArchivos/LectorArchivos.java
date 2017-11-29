/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class LectorArchivos {
    
    public  ArrayList<String> leerArchivo(String filePath){
        BufferedWriter writer=null;
        FileReader fileReader=null;       
        ArrayList<String> lineas = new ArrayList<String>();
        String line;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fileReader);
        try {                              
                while((line = br.readLine()) != null) {
                    lineas.add(line);
                    //System.out.println("Entrada Inventario: " + line);
                }
        }catch (IOException ex) {
            Logger.getLogger(LectorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }        

        try {
            fileReader.close();
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lineas;
    }   
    
    
}
