/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrimerEjercicio;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class EjecutorPrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    static PilaPrimerEjercicio pila = new PilaPrimerEjercicio();
    static String variable, palabra;
    public static void main(String[] args) {        
        boolean salir = false;
        EjecutorPrimerEjercicio primero = new EjecutorPrimerEjercicio();
        while(salir != true){
        primero.datos();
        if(pila.estaVacia()){
            System.out.println("La cadena es correcta");
        }else{
            System.out.println("Cadena incorrecta");
        }
        primero.palabra();
        
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion = sc.nextInt();
            switch(eleccion){
                case 1: salir=true;
                break;
                case 2: salir = false;
                break;
                default: System.out.println("Se repetirá debido a no seleccionar una opción valida");
                break;
            }
        }
    }
    public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
        
    }
    public void datos(){
        System.out.println("Ingrese el dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            if(c =='('){
                pila.push(c);
                if(c=='{'){
                    pila.push(c);
                    if(c=='['){
                        pila.push(c);
                    }
                }
            }else if (c == ')'){
                pila.pop();
                if(c=='}'){
                    pila.push(c);
                    if(c==']'){
                        pila.push(c);
                    }
            }
        }
    }
    
}
}