/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe algo para codificarlo.");
        String entrada= leer.nextLine();
                        
        String codi =codificar(entrada);
        
        System.out.println("Esta es la frase codificada ");
        System.out.println(codi);
        
    }
    

public static String codificar (String entrada){
String salida;

salida = entrada.replace("a", "@" );
salida = salida.replace("e", "#");
salida = salida.replace("i", "$");
salida = salida.replace("o", "%");
salida = salida.replace("u", "*");
salida = salida.replace("A", "@" );
salida = salida.replace("E", "#");
salida = salida.replace("I", "$");
salida = salida.replace("O", "%");
salida = salida.replace("U", "*");
return salida;


}
}