/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

/**
 *
 * @author coromoro
 */
public class SumaMultiplos {
 
    public void multiplos () {
        int sumaMultiplos3 = 0;
        int sumaMultiplos4 = 0;
        int sumamultiplos5 = 0;
        int sumaTotal=0;
        
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                sumaMultiplos3 += i;
            }
        }

        for (int i = 1; i <= 1000; i++) {
            if (i % 4 == 0) {
                sumaMultiplos4 += i;
            }
        }

        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                sumamultiplos5 += i;
            }
        }

        sumaTotal = sumaMultiplos3 + sumaMultiplos4 + sumamultiplos5;

        System.out.println("Suma de múltiplos de 3: " + sumaMultiplos3);
        System.out.println("Suma de múltiplos de 4: " + sumaMultiplos4);
         System.out.println("Suma de múltiplos de 5: " + sumamultiplos5);
        System.out.println("Suma total : " + sumaTotal);
    }
}

