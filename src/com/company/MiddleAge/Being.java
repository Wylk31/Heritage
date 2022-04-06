package com.company.MiddleAge;

public abstract class Being extends SpacialElement implements java.lang.Comparable<Being> {

    private int maxHealth = 100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

    public void receiveDamage (int amount) {

    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Being{");
        sb.append("maxHealth=").append(maxHealth);
        sb.append(", health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Being b) {
        if(this.health < b.health) {
            return -1;
        } else if (this.health > b.health) {
            return 1;
        } else {
            return 0;
        }
    }


}
