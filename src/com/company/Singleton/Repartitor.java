package com.company.Singleton;

import java.util.ArrayList;

public class Repartitor {

    private static Repartitor instance;
    private ArrayList<Printer> printers = new ArrayList<>();
    private int currentPrinterIndex = 0;

    Repartitor() {

    }

    public static Repartitor getInstance() {
        if(instance == null) {
            instance = new Repartitor();
        }
        return instance;
    }

    public void print () {
        Printer printer = printers.get(currentPrinterIndex++);
        printer.print();
        if(currentPrinterIndex>= printers.size()) {
            currentPrinterIndex = 0;
        }
    }

    public ArrayList<Printer> getPrinters() {
        return printers;
    }

    public void setPrinters(ArrayList<Printer> printers) {
        this.printers = printers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repartitor{");
        sb.append("printers=").append(printers);
        sb.append(", currentPrinterIndex=").append(currentPrinterIndex);
        sb.append('}');
        return sb.toString();
    }
}
