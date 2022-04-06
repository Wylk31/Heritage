package com.company;


import java.util.*;
import java.util.stream.Collectors;

import com.company.Banque.CompteEpargne;
import com.company.Banque.ComptePayant;
import com.company.MiddleAge.*;
import com.company.Motors.*;
import com.company.Singleton.Computer;
import com.company.Singleton.Printer;
import com.company.Singleton.Repartitor;
import com.company.monProjet.Parking;
import com.company.monProjet.Parking.*;
import com.company.restaurant.Order;
import com.company.Banque.Compte;
import com.company.Banque.CompteSimple;

public class Main {

    public static void main(String[] args) {

   ArrayList <Being> being = new ArrayList<>();

    being.add(new Dragon("Gege", 1, 1, 100, 40,0,0, 10));
    being.add(new Wolf("Wolfy", 1, 1, 100, 30, 15));
    being.add(new Eagle("Fly", 1, 1, 100, 20, 15,70));
    being.add(new Human("Jean", 1, 1, 100, 25, 15,70));
    being.add(new Orc("Dave", 1, 1, 100, 35, 15));


        for (Being beings : being) {
            System.out.println(beings);
        }

    Collections.sort(being);
        System.out.println("-------");
        for (Being beings : being) {
            System.out.println(beings);
        }



    }
}





