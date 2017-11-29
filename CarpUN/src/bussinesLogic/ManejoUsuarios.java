/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

import data.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class ManejoUsuarios {
    
    public Usuario buscarUsuario(ArrayList<String> usuarios, long documento){
        Usuario usuarioEncontrado=null;
        for (int i=0;i< usuarios.size() ; i++){
            String[] lineaPartida = usuarios.get(i).split("%");
            
            long esteDoc = Long.parseLong(lineaPartida[3].trim());
            if (esteDoc == documento){
                String nombre = lineaPartida[0].trim();
                String universidad = lineaPartida[1].trim();
                long telefono = Long.parseLong(lineaPartida[2].trim());
                long documentoUsuario = Long.parseLong(lineaPartida[3].trim());
                String direccion = lineaPartida[4].trim();
                String tipoUsuario = lineaPartida[5].trim();
                
                usuarioEncontrado = new Usuario(nombre, documentoUsuario, universidad, direccion, telefono, tipoUsuario);
            }
        }
        
        return usuarioEncontrado;
    }
}
