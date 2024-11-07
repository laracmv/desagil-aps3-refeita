package br.edu.insper.desagil.aps3.steep;

public abstract class Unit {
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;

    public Unit(int x, int y, int width, int height, int health) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getHealth() {
        return health;
    }

    public void hurt(int loss) {
        health -= loss;
    }

    public void heal(int gain) {
        health += gain;
    }
}
