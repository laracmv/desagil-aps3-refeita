package br.edu.insper.desagil.aps3.steep;

public class Enemy extends MobileUnit {
    private boolean paralyzed;

    public Enemy(int x, int y, int power, int health) {
        super(x, y, power, health);
        this.paralyzed = false;
    }

    public void hold() {
        paralyzed = true;
    }

    public void release() {
        paralyzed = false;
    }

    public void move(int dx, int dy) {
        if (!paralyzed) {
            super.move(dx, dy);
        }
    }
}
