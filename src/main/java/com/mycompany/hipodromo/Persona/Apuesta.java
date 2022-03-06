package com.mycompany.hipodromo.Persona;
/**
 * @author Melanni Tzul
 */
//Clase Apuesta
public class Apuesta {

    private String Nombre;//Nombre del apostador
    private double Monto;//Cantidad que va a apostar por el caballo
    private int[] ArrayPocisiones;
    private int puntos;
    

    public Apuesta() {

    }
    //Costructor de mi clase apostador
    public Apuesta(String Nombre, double Monto, int[] ArrayPocisiones) {
        this.Nombre = Nombre;
        this.Monto = Monto;
        this.ArrayPocisiones = ArrayPocisiones;    
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

    public int[] getArrayPocisiones() {
        return ArrayPocisiones;
    }

    public void setArrayPocisiones(int[] ArrayPocisiones) {
        this.ArrayPocisiones = ArrayPocisiones;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
 

}
