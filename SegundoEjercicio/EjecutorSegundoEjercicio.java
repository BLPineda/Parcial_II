/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SegundoEjercicio;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class EjecutorSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static PilaSegundoEjercicio pila = new PilaSegundoEjercicio();
    static String variable, palabra;
    public static void main(String[] args) {
        EjecutorSegundoEjercicio pilaExamen = new EjecutorSegundoEjercicio();
        
        pilaExamen.datos();
        pilaExamen.palabra();
        pilaExamen.verificar();
    }
    
    public void datos(){
        System.out.println("Ingrese el dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            pila.push(c);
        }
    }
    
 
    
    public void verificar(){
      if (variable.equals(palabra)){
          System.out.println("Es palindromo");
      }else{
          System.out.println("No es");
      }
    }
       public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
    }
}
