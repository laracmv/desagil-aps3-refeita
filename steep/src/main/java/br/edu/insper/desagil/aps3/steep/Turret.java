package br.edu.insper.desagil.aps3.steep;

import java.util.List;

public class Turret extends Unit {
    private List<Ally> defenders;

    public Turret(int x, int y, int health, List<Ally> defenders) {
        super(x, y, 3, 3, health);
        this.defenders = defenders;
    }

    public List<Ally> getDefenders() {
        return defenders;
    }

    public void add(Ally defender) {
        defenders.add(defender);
    }

    public void remove(int index) {
        defenders.remove(index);
    }
}
