/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author USER
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicePelicula serv = new ServicePelicula();
        serv.cargarPeliculas();
        System.out.println("--------------");
        serv.mostrarPeliculas();
        System.out.println("--------------");
        serv.mostrarHora();
        System.out.println("--------------");
        serv.ordDesc();
        System.out.println("--------------");
        serv.ordAsc();
        System.out.println("--------------");
        serv.ordTit();
        System.out.println("--------------");
        serv.ordDir();
    }

}
