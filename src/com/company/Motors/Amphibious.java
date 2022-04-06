package com.company.Motors;

public class Amphibious extends Vehicule implements Flottant, Roulant {

    @Override
    public void naviguer() {
        System.out.println("L'amphibien avance");
    }

    @Override
    public void leverAncre() {
        System.out.println("L'amphibien lève l'ancre");
    }

    @Override
    public void jeterAncre() {
        System.out.println("L'amphibien jette l'ancre");
    }

    @Override
    public void rouler() {
        System.out.println("L'amphibien roule");
    }
}
