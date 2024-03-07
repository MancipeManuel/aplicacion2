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
public class ActividadCiclos {
    String[] listaNombres= new String[10];
    
    public void cicloMientras(){
        listaNombres= new String [11];
        listaNombres[0]="Edwar Snowden";
        listaNombres[1]="Bill Gates";
        listaNombres[2]="Steve jobs";
        listaNombres[3]="Mark Zukerverg";
        listaNombres[4]="German Cruz";
        listaNombres[5]="linus Tolvards";
        listaNombres[6]="Grigori Perelman";
        listaNombres[7]="Terrence Tao";
        listaNombres[8]="James Gosling";
        listaNombres[9]="Steve Wozniak";
        listaNombres[10]="Stephen Hawking";
        
        int i=0;
        while (i<listaNombres.length) {
            if (listaNombres[i].endsWith("s")) {
                System.out.println("El aprendiz  "+ i+" es "+listaNombres[i]);
            }
            i++;
        } 
        
    }
    public void comienzaPorST(){
        cicloMientras();
        int i=0;
        do {   
            if (listaNombres[i].startsWith("St")) {
                System.out.println("El aprendiz  "+i+" es "+listaNombres[i]);
                }
                i++;
        } while (i<listaNombres.length);
    }
}
