package com.company.Motors;

public class Car extends Vehicule implements Roulant {

    @Override
    public void rouler() {
        System.out.println("La voiture roule");
    }
}
