package com.company.Singleton;

public class Computer {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void print () {
        Repartitor repartitor = new Repartitor();
        repartitor.print();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
