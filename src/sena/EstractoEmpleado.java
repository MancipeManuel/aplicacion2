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
public class EstractoEmpleado {
    
    int estracto;
    
    public void pedirEstracto(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escriba el estrato");
        estracto = teclado.nextInt();
    }
    String ciudad, nombreCompleto;
    float estatura;
    double distancia;
    
    public void pedirCiudad(){
        Scanner teclado =new Scanner(System.in);
        System.out.println("Escriba la ciudad");
        ciudad = teclado.next();
        System.out.println("Escribe la estatura");
        estatura=teclado.nextFloat();
        System.out.println("Escriba la distancia");
        distancia=teclado.nextDouble();
        System.out.println("Escriba nombres y apellidos");
        nombreCompleto=teclado.next();
    }
    
}
