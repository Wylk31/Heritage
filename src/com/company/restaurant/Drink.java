package com.company.restaurant;

public enum Drink {

    Water (2), Beer (2), Coke (2) ;

    private int price;

    public int getPrice() {
        return price;
    }


    Drink(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drink{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
