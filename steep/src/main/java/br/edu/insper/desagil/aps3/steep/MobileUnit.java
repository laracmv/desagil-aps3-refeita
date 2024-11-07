package br.edu.insper.desagil.aps3.steep;

public abstract class MobileUnit extends Unit {
    private int power;

    public MobileUnit(int x, int y, int health, int power) {
        super(x, y, health, 1, 1);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void move(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}
