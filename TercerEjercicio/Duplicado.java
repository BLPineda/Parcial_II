/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjercicio;
import java.util.Stack;
/**
 *
 * @author lenin
 */

public class Duplicado {

    public Duplicado() {
    }

    public boolean Duplicado(String s){
        Stack<Character> pila = new Stack<>();
        
        char[] str = s.toCharArray();
        for(char ch : str) { 
            
            if (ch == ')'){
                char cima = pila.peek();
                pila.pop();
                
                int elementos = 0;
                
                while (cima != '('){
                    elementos++;
                    cima = pila.peek(); 
                    pila.pop(); 
                }
                if (elementos < 1){ 
                    return true; 
                }
            }else{ 
                pila.push(ch);
            }
        }
    return false;
    }
    
}