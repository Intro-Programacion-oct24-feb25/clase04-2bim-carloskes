/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo03;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 o 2");
       int valor1 = entrada.nextInt();
       switch (valor1) {
           case 1:
               System.out.println("Ingrese el número a sumar");
       int valor2 = entrada.nextInt();

               System.out.println("Ingrese el límite de tabla");
       int valor3 = entrada.nextInt();
               
        mensajeSuma = obtenerTablaSumar(valor2, valor3);
        System.out.printf("%s\n", mensajeSuma);
           
           break;
           case 2:
               System.out.println("Ingrese el número a sumar");
       int valor4 = entrada.nextInt();

               System.out.println("Ingrese el límite de tabla");
       int valor5 = entrada.nextInt();
       
        mensajeSumaDos = obtenerTablaMultiplicar(valor4, valor5);
        System.out.printf("%s\n", mensajeSumaDos);
           
           break;
       }
       
        
        
        
        
        
        
         // se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        
        
        
        
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= tabla; i++) {
            operacion = limite + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, limite, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= tabla; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, limite, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
