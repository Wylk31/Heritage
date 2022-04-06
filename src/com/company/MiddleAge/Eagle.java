package com.company.MiddleAge;

public class Eagle extends Animal {

    public int vision;

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, int vision) {
        super(name, x, y, maxHealth, health, resistance);
        this.vision = vision;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Eagle{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", vision=").append(vision);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Being o) {
        return 0;
    }
}
