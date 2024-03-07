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
public class EstratoEstudiante {

    String[]nombreEstudiante=new String[7];
    int [] estratoEstudiante=new int[7];
     
    void pedirNombreyEstrato(){
        Scanner teclado =new Scanner(System.in);
        for(int i =0; i < nombreEstudiante.length; i++){
            System.out.println("Escriba el nombre");
            String unNombreEmpleado=teclado.next();
            System.out.println("Escriba estrato");
            int unEstratoEmpleado=teclado.nextInt();
            nombreEstudiante[i]=unNombreEmpleado;
            estratoEstudiante[i]=unEstratoEmpleado;
            
        
    }
    }
    
    public void mostrarEstudianteTres(){
    pedirNombreyEstrato();
    for(int i=0;i<estratoEstudiante.length;i++){
        int elEstrato=estratoEstudiante[i];
        if(elEstrato==3){
            System.out.println("Estudiante"+nombreEstudiante[i]+"es 3");
            
        }
    
    }
    }
}

