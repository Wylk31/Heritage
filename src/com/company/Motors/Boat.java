package com.company.Motors;

public class Boat extends Vehicule implements  Flottant {


    @Override
    public void naviguer() {
        System.out.println("Le bateau avance");
    }

    @Override
    public void leverAncre() {
        System.out.println("Le bateau lève l'ancre");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le bateau jette l'ancre");
    }
}
