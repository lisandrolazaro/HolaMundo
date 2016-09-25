package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Persona mirko = new Persona();
        mirko.setNombre("Mirko");
        mirko.setAppellidos("Apellidos");

        Persona mely = new Persona();
        mely.setNombre("Mely");
        mely.setAppellidos("Apellidos");

        Ciudad juliaca = new Ciudad();
        List<Persona> personas = new ArrayList();
        personas.add(mirko);
        juliaca.setPersonas(personas);

        System.out.print(juliaca.getPersonas().get(0).getNombre());
        System.out.print(juliaca.getPersonas().get(1).getNombre());
    }
}

