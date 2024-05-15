package com.pvzgame;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Plant> kumpulanPlant;
    private final List<Zombie> kumpulanZombie;
    
    public Inventory() {
        kumpulanPlant = new ArrayList<>();
        kumpulanZombie = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        kumpulanPlant.add(plant);
    }

    public void addZombie(Zombie zombie) {
        kumpulanZombie.add(zombie);
    }

    public List<Plant> getPlants() {
        return kumpulanPlant;
    }

    public List<Zombie> getZombies() {
        return kumpulanZombie;
    }

    public void printInventory() {
        System.out.println("Plants in Inventory:");
        for (Plant plant : kumpulanPlant) {
            System.out.println(plant);
        }
        System.out.println("\nZombies in Inventory:");
        for (Zombie zombie : kumpulanZombie) {
            System.out.println(zombie);
        }
    }
}
