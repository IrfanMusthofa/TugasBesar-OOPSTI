package com.pvzgame;

import java.util.List;

import com.pvzgame.Plant.Plant;
import com.pvzgame.Zombie.Zombie;

public class Menu {
    private final Inventory currentInventory;
    private final Deck currentDeck;
    
    public Menu(Inventory currInventory, Deck currDeck){
        this.currentInventory = currInventory;
        this.currentDeck = currDeck;
    }

    public void start(){
        System.out.println("Game dimulai!");
    }

    public void help(){
        System.out.println("Help");
    }

    public void printPlantList(){
        List<Plant> plants = currentInventory.getPlants(); // Asumsi Inventory memiliki metode getPlants
        System.out.println("Daftar Tanaman:");
        for (Plant plant : plants) {
            System.out.println(plant.getPlantName());
        }    }

    public void printZombieList(){
        List<Zombie> zombies = currentInventory.getZombies(); // Asumsi Inventory memiliki metode getZombies
        System.out.println("Daftar Zombie:");
        for (Zombie zombie : zombies) {
            System.out.println(zombie.getZombieName());
        }
    }

    public void printDeck(){
        System.out.println("Daftar Tanaman di Deck: ");
        currentDeck.printDeck();
    }
}