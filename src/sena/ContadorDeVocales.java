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
public class ContadorDeVocales {

    public  void cv() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese un texto");
        String texto= (teclado.next());
        int vocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (esVocal(letra)) {
                vocales++;
            }
        }

        System.out.println("El texto tiene " + vocales + " vocales.");
    }

    private static boolean esVocal(char letra) {
        return "aeiouAEIOU".contains(String.valueOf(letra));
    }
}

        
                
    
    

