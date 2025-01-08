/*

generar una solucion que permita sumar 2 numero a traves de un metodo, los
numero deben ser ingresados en el metodo main, el metodo que genera la suma
debe verificar que los 2 numeros sean positivos para realizar la operacion,
caso contrario debe devolver 0 como suma.

 */
package ejemplo03;
import java.util.Scanner;
       

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner entrada = new Scanner(System.in);
        // 
        System.out.println("Ingrese el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2 = entrada.nextInt();
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la \"suma\" es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        if (a < 1 || b < 1 ){
            suma = 0;
        }else{
        suma = a + b;
        }
        return suma;
        // return a + b;
        
        
    }
    
    
}
