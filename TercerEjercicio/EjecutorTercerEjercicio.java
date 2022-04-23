/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TercerEjercicio;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class EjecutorTercerEjercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static String expresiones;
    static Duplicado duplicado = new Duplicado();
    public static void main(String[] args) {
        boolean salir=false;
        while(salir!=true){
        System.out.println("Escriba la expresión");
        expresiones = sc.next();
        
        if(duplicado.Duplicado(expresiones)){
            System.out.println("Hay parentesis repetidos");
        }else{
            System.out.println("No hay parentesis repetidos");
        }
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1: salir = true;
                break;
                case 2: salir = false;
                break;
                default: System.out.println("Se repetirá a falta de elección concisa");
                break;
            }
        }
    }
    
}
