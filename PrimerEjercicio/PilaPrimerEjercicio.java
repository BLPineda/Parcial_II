/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerEjercicio;

/**
 *
 * @author lenin
 */
public class PilaPrimerEjercicio {
    NodoPilaPrimerEjercicio cima;
    int tamaño;

    public PilaPrimerEjercicio() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        NodoPilaPrimerEjercicio nuevo = new NodoPilaPrimerEjercicio(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public char pop(){
        char aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }
    
    public char cima(){
        return cima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return cima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }

}
