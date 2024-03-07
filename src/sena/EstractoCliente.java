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
public class EstractoCliente {
    
    short estracto;
    
    void pedirEstracto(){
        System.out.println("Dijite su estracto");
        Scanner teclado = new Scanner (System.in);
        estracto = teclado.nextShort();
    }
    void clasificacionDeEstracto(){
        if (estracto<3) {
            System.out.println("Estracto bajo");
        } else {
            System.out.println("Estracto alto");
        }
    }
    public void ejecuta(){
    pedirEstracto();
    clasificacionDeEstracto();
    }
}
