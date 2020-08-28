
package loteria1;

import java.util.Random;

public class Loteria1 {

    
    public static void main(String[] args) {
        int[] ndigitos = new int[10];
         int n;
         
         Random rnd = new Random();
          for (int i = 0; i < 5; i++) {
        ndigitos[i] = 0;
    }
           
    for (long i=0; i < 10; i++) {
// genera un número aleatorio entre 0 y 9
        n = (int)(rnd.nextDouble() * 10.0);
//Cuenta las veces que aparece un número
        ndigitos[n]++;
    }

// imprime los resultados
    for (int i = 0; i < 10; i++) {
        System.out.println(i+": " + ndigitos[i]);
    }
     for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    }
    
    }
    
}
