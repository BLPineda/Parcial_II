/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author lenin
 */
public class PilaSegundoEjercicio {
    NodoPilaSegundoEjercicio cima;
    int tamaño;

    public PilaSegundoEjercicio() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        NodoPilaSegundoEjercicio nuevo = new NodoPilaSegundoEjercicio(dato);
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
    
//    public void invertir(){
//        String aux = cima.getDato();
//        StringBuilder strb = new StringBuilder(aux);
//        aux = strb.reverse().toString();
//        System.out.println(aux);
//        
//        if (aux=cima.getDato()){
//            System.out.println("La palabra e palíndroma");
//        }else if(aux!=cima.getDato()){
//            System.out.println("La palabra no es palíndroma");
//        }
//    }
    
    
}
