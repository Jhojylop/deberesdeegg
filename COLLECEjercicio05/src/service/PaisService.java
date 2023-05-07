package service;


import models.Pais;

import java.util.*;

public class PaisService {
    private Set<Pais> paises = new HashSet<>();
    private Scanner scan = new Scanner(System.in);

    public void agregarPais() {
        paises.add(crearPais());
    }

    public Pais crearPais() {
        Pais pais = new Pais();
        boolean bandera = true;
        do {
            System.out.println("Ingrese el nombre de un País");
            String validacionPais = scan.nextLine().toUpperCase();
            if (buscarPais(validacionPais) == null) {
                pais.setPais(validacionPais);
                bandera = false;
            } else {
                System.out.println("El pais ya existe..");
            }

        } while (bandera);

        return pais;
    }

    public void mostrarPaises() {
        paises.forEach(System.out::println);
    }

    public void eliminarPais(String pais) {
        Pais pasEncontrado = buscarPais(pais);
        if (pasEncontrado != null) {
            System.out.println("El pais " + pais + " fue eliminado...");
            paises.remove(pasEncontrado);

        } else {
            System.out.println("Pais " + pais + " no encontrado...");
        }
    }

    public Pais buscarPais(String pais) {
        Pais paisEncontrado = null;
        for (Pais country : paises) {
            if (country.getPais().equals(pais)) {
                paisEncontrado = country;
            }
        }
        return paisEncontrado;
    }

}

