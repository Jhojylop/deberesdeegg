package service;

import models.Clave;

public class ClaveService {
    Clave clave = new Clave();
    public void crearClave(){
        int verificar;
        String nuevoVector = "";

        for (int i = 0; i < 5 ; i++) {
            verificar = (int)(Math.random()*10);
            nuevoVector = String.valueOf(verificar);
            if (nuevoVector.contains(nuevoVector.substring(i,i+1))){
                verificar = (int)(Math.random()*10);
                nuevoVector = String.valueOf(verificar);

                clave.setClaveGenerada(clave.getClaveGenerada() = nuevoVector);
            }

        }
        clave.setClaveGenerada(codigo.toString());
        System.out.println(clave.getClaveGenerada());
    }
}
