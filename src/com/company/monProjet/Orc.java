package com.company.monProjet;

public class Orc implements java.lang.Comparable<Orc> {

    private String name = "NameLess";
    private int health;
    private int force;

    public Orc(int health, int force) {
        this.health = health > 100 ? 100 : health;
        this.force = force;
    }

    public Orc(String name, int health, int force) {
        this(health, force);
        this.name = name;

    }

    public void attack(Orc o) {
        o.health -= this.force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orc{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Orc o) {
        if(this.force < o.force) {
            return -1;
        } else if (this.force > o.force) {
            return 1;
        }else {
            return 0;
        }
    }
}
