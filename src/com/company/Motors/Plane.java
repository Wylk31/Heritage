package com.company.Motors;

public class Plane extends Vehicule implements Volant {


    @Override
    public void decoller() {
        System.out.println("L'avion décolle");
    }

    @Override
    public void atterir() {
        System.out.println("L'avion attérit");
    }

    @Override
    public void barrelRoll() {
        System.out.println("L'avion fait un tonneau");
    }
}



