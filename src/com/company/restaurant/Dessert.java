package com.company.restaurant;

public enum Dessert {

    IceCream (6), Chocosnack (5);

    private int price;

    Dessert(int price) {this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dessert{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
