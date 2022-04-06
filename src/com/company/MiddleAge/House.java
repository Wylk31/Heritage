package com.company.MiddleAge;

public class House extends SpacialElement {

    private int price;
    private Ematerial ematerial;

    public House(String name, int x, int y) {
        super(name, x, y);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ematerial getEmaterial() {
        return ematerial;
    }

    public void setEmaterial(Ematerial ematerial) {
        this.ematerial = ematerial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("price=").append(price);
        sb.append(", ematerial=").append(ematerial);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
