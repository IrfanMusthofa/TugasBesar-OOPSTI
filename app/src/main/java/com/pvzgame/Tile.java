package com.pvzgame;

// Import
import com.pvzgame.Zombie.Zombie;
import java.util.List;

public class Tile {

    // Attributes
    private Boolean isProtectedArea;
    private Boolean isSpawnArea;
    private Boolean water;
    private Plant plant;
    private List<Zombie> zombies;

    // Constructor
    public Tile(Boolean isProtectedArea, Boolean isSpawnArea, Boolean water, Plant plant, List<Zombie> zombies) {
        this.isProtectedArea = isProtectedArea;
        this.isSpawnArea = isSpawnArea;
        this.water = water;
        this.plant = plant;
        this.zombies = zombies;
    }

    // Getter
    public Boolean getIsProtectedArea() {
        return isProtectedArea;
    }
    
    public Boolean getIsSpawnArea() {
        return isSpawnArea;
    }

    public Boolean getWater() {
        return water;
    }

    public Plant getPlant() {
        return plant;
    }

    public List<Zombie> getZombies() {
        return zombies;
    }

    // Setter
    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void setZombies(List<Zombie> zombies) {
        this.zombies = zombies;
    }

    public void addZombie(Zombie zombie) {
        this.zombies.add(zombie);
    }

    public void removeZombie(Zombie zombie) {
        this.zombies.remove(zombie);
    }

    public void removePlant() {
        this.plant = null;
    }

    public void removeZombies() {
        this.zombies.clear();
    }

    public void changeProtectedAreaStatus() {
        isProtectedArea = !isProtectedArea;
    }


    public void changeSpawnAreaStatus() {
        isSpawnArea = !isSpawnArea;
    }

    public void changeWaterStatus() {
        water = !water;
    }

    public void changePlantStatus() {
        plant = null;
    }


    public void removeAllZombies() {
        zombies.clear();
    }

}


