package com.company.MiddleAge;

public class Castle extends House {

    public int defense;

    public Castle(String name, int x, int y) {
        super(name, x, y);
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Castle{");
        sb.append("defense=").append(defense);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
