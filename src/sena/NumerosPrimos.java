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
public class NumerosPrimos {
   

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false; // 1 y números menores no son primos
    }
    if (num % 2 == 0 && num > 2) {
      return false; // Números pares mayores a 2 no son primos
    }
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num / i == 0) {
        return false;
      }
    }
    return true;
  }

  public  void primos() {
    int numero = 13;
    if (isPrime(numero)) {
      System.out.println(numero + " es un número primo");
    } else {
      System.out.println(numero + " no es un número primo");
    }
  }
}

    

