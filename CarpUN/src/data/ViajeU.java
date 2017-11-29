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
public class ViajeU extends Viaje{
// Atributos
    private String Categoria = "U";
    private Universidad[] Llegadas;
    private Direccion[] Salidas;
// Construcctor

    public ViajeU(Conductor conductor, String horaSalida, int cantidad) {
        super(conductor, horaSalida, cantidad);
        this.Llegadas = new Universidad[cantidad + 1];
        this.Salidas = new Direccion[cantidad + 1];
    }
    
}
