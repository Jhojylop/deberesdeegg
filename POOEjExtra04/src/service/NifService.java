package service;

import models.Nif;

import java.util.Scanner;

public class NifService {
    private Scanner scan = new Scanner(System.in);
    Nif nif = new Nif();
    public void crearNif(){
        System.out.println("Ingrese el dni del usuario recuerde que debe ser un valor mayor a 23: ");
        nif.setDni(scan.nextLong());
    }
    public void mostrarNif(){
      //  String [] letras = cargarLetras();
        String [] letras = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int dni = (int) nif.getDni();
        int valorLetra = (dni % 23);
        for (int i = 0; i < letras.length; i++) {
            if(letras[i].equals(letras[valorLetra])){
                nif.setLetra(letras[i]);
                System.out.println("este es resultado: "+nif.getDni()+"-"+nif.getLetra());
            }
        }


    }
    //public String [] cargarLetras(){
      //  String [] letras = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
       // String [] letrasVector = new String[letras.length()];
        //for (int i = 0; i < letrasVector.length; i++) {
         //   letrasVector[i] = letras.substring(i,i+1);
        //}
        //return letrasVector;
   // }

}
