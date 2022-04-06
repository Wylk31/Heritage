package com.company.Motors;

public class Canadair extends Vehicule implements Volant, Flottant {

    @Override
    public void naviguer() {
        System.out.println("Le Canadair avance");
    }

    @Override
    public void leverAncre() {
        System.out.println("Le Canadair lève l'ancre");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le Canadair jette l'ancre");
    }

    @Override
    public void decoller() {
        System.out.println("Le Canadair décolle");
    }

    @Override
    public void atterir() {
        System.out.println("Le Canadair attérit");
    }

    @Override
    public void barrelRoll() {
        System.out.println("Le Canadair fait un tonneau");
    }
}
