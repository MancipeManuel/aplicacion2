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
public class AtributosyMetodos {
    String nombre ="Hector Mancipe";
    short edad = 16;
    int poblacion = 1_200_000;
    long enteroLargo = 200_045_320_202l;
    char vocal = 'a';
    float altura = 1_500.253f;
    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;
    
public void mostrarVariables(){
    System.out.println("nombre:     "+nombre);
    System.out.println("edad:       "+edad);
    System.out.println("poblacion:  "+poblacion);
    System.out.println("entero largo"+enteroLargo);
    System.out.println("vocal       "+vocal);
    System.out.println("altura      "+altura);
    System.out.println("distancia   "+distancia);
    System.out.println("es de noche "+esNoche);
    
}
    public void dividirDosNumeros(){
        float numero=220f;
        float valor=12f;
        float resultado= numero/valor;
        System.out.println("resultado="+resultado);
    }
    public void multiplicarDosNumeros(int cantidad, int precio){
        int total = precio*cantidad;
        System.out.println("total="+total);
    }
    int restarDosNumeros(int cotizacion, int presupuesto){
        int respuesta = cotizacion * presupuesto;
        return respuesta;
    }
    double sumarDosNumeros (double poblacion,double dato){
    double salida = poblacion + dato;
    return salida;
    }
    public void mostrarSumayResta(){
        int resta = restarDosNumeros(50,23);
        double suma =sumarDosNumeros(89.29, 233.002);
        System.out.println("la resta da="+resta);
        System.out.println("la suma es="+suma);
    }
    
}
