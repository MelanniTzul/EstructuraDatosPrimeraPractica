
package com.mycompany.hipodromo.Persona;

/**
 *
 * @author Melanni Tzul
 */
//Clase Apostador 
public class Apostador {
    private String Nombre;
    private double Monto;

    public Apostador() {
        
    }
    //Costructor de mi clase apostador
    public Apostador(String Nombre, double Monto) {
        this.Nombre = Nombre;
        this.Monto = Monto;
    }
 
    //Declarando get y set de mi clase apostador 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}
