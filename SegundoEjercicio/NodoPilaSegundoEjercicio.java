/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author lenin
 */
public class NodoPilaSegundoEjercicio {
    char dato;
    NodoPilaSegundoEjercicio siguiente;

    public NodoPilaSegundoEjercicio(char dato) {
        this.dato = dato;
        siguiente = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    
}
