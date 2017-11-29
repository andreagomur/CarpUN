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
public class ViajeC extends Viaje{
// Atributos
    private String Categoria= "C";
    private Universidad[] Salidas;
    private Direccion[] Llegadas;
// Constructor 

    public ViajeC(Conductor conductor, String horaSalida, int cantidad) {
        super(conductor, horaSalida, cantidad);
        this.Llegadas = new Direccion[cantidad + 1];
        this.Salidas = new Universidad[cantidad + 1];
    }


    
   
}
