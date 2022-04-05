package com.company;


import java.util.*;
import java.util.stream.Collectors;

import com.company.Banque.CompteEpargne;
import com.company.Banque.ComptePayant;
import com.company.Singleton.Computer;
import com.company.Singleton.Printer;
import com.company.Singleton.Repartitor;
import com.company.monProjet.Car;
import com.company.monProjet.Parking;
import com.company.monProjet.Parking.*;
import com.company.restaurant.Order;
import com.company.Banque.Compte;
import com.company.Banque.CompteSimple;

public class Main {

    public static void main(String[] args) {
        CompteSimple c1 = new CompteSimple(1234, 23456, 150);
        ComptePayant e1 = new ComptePayant(4567, 4527);

        e1.verser(325);


    }
}





