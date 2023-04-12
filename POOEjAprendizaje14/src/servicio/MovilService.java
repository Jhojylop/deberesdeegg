package servicio;

import models.Movil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovilService {
    private Scanner scan = new Scanner(System.in);
    private List<Movil> moviles = new ArrayList<>();

    public void cargarCelular() {
        Movil movil = new Movil();
        System.out.println("Ingrese la marca del celular: ");
        movil.setMarca(scan.next());
        System.out.println("Ingrese el modelo del celular ");
        movil.setModelo(scan.next());
        System.out.println("Ingrese el almacenamiento interno del celular: ");
        movil.setAlmacenamiento(scan.nextInt());
        System.out.println("Ingrese la ram del celular: ");
        movil.setMemoriaRam(scan.nextInt());
        System.out.println("Ingrese el precio del celular: ");
        movil.setPrecio(scan.nextDouble());
        System.out.println("Ingrese un codigo de 7 numeros para celular: ");
        movil.cargarCodigo();
        moviles.add(movil);
    }

    public void mostrarCelular() {
        System.out.println("Ingrese el codigo del celular que desea mostrar los datos: ");
        String codigoVerificar = scan.next();
        Movil movilEncontrado = buscarCelular(codigoVerificar);
        if (movilEncontrado == null) {
            System.out.println("Celular no encontrado...");
            return;
        }
        System.out.println(movilEncontrado);

    }

    public Movil buscarCelular(String codigoVerificar) {
        Movil movilEncontrado = null;
        for (Movil movil : moviles) {
            StringBuilder nuevoString = new StringBuilder();
            for (int i = 0; i < movil.getCodigo().length; i++) {
                nuevoString.append(movil.getCodigo()[i]);
            }
            String resultadoString = nuevoString.toString();
            if (resultadoString.equals(codigoVerificar)) {
                movilEncontrado = movil;
            }

        }
        return movilEncontrado;
    }

    public void mostrarTodo() {
        for (Movil movil : moviles) {
            System.out.println(movil);
        }
    }
}
