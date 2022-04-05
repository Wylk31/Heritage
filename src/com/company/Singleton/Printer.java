package com.company.Singleton;

public class Printer {

    private String model;

    public Printer(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Printer{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
