package ru.sorokova.simulator.model;

public class Bear {

    private int energy = 100;
    private int health = 100;
    private double coeffRecovery = 1.5;

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public double getCoeffRecovery() {
        if (energy > 100) {
            return 100;
        }
        if (energy < 0) {
            return 0;
        }
        return energy;
    }
}




