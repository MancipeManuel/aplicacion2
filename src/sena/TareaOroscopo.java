/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

import java.util.Scanner;

/**
 *
 * @author coromoro
 */
public class TareaOroscopo {

    String signoZoodiacal="";
    
    void pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba su signo Zoodiacal");
        signoZoodiacal=teclado.nextLine();
        
    }
    
    void procesarDatos(){
    signoZoodiacal=signoZoodiacal.trim();
    signoZoodiacal=signoZoodiacal.toLowerCase();
    
    }
    
    void mostrarMensaje(){
    System.out.println("tu horoscopo es :");
    switch(signoZoodiacal){
        case"aries":
            System.out.println("te saldran oporunidades");
            break;
            case"picis":
                System.out.println("te llamaran al cel");
                break;
                case"tauro":
                    System.out.println("encontraras dinero");
                    break;
                default:
                    System.out.println("signo no existe");
    }
    }
     public void todo(){
    pedirDatos();
    procesarDatos();
    mostrarMensaje();
     }
    }


