package com.company.MiddleAge;

public class Human extends Humanoïd {

    public int mana;

    public Human(String name, int x, int y, int maxHealth, int health, double resistance, int mana) {
        super(name, x, y, maxHealth, health, resistance);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", mana=").append(mana);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}

