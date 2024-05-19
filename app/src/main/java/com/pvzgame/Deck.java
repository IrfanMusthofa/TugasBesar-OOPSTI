package com.pvzgame;
import java.util.ArrayList;
import java.util.List;

import com.pvzgame.Plant.Plant;

public class Deck {
    private final List<Plant> currentDeck;
    private Integer availableSlot;

    public Deck(){
        currentDeck = new ArrayList<>();
        availableSlot = 0;
    }

    public List<Plant> getDeck(){
        return currentDeck;
    }

    public boolean isDeckEmpty(){
        return availableSlot == 0;
    }

    public boolean isDeckFull(){
        return availableSlot == 6;
    }

    public void addPlant(Plant plant){
        if (!isDeckFull()) {
            currentDeck.add(plant);
            availableSlot++;
        } else {
            System.out.println("Deck is full. Cannot add more plants.");
        }
    }

    public void swapPlant(Plant newPlant, int plantIndex){
        currentDeck.remove(plantIndex);
        currentDeck.add(plantIndex, newPlant);
    }

    public void removePlant(){
        if (!isDeckEmpty()) {
            currentDeck.remove(availableSlot-1);
            availableSlot--;
        } else {
            System.out.println("Deck is empty. Cannot remove plant.");
        }
    }

    public void printDeck(){
        System.out.println("List Plant di dalam Deck:");
        for (int i = 0; i < availableSlot; i++) {
            System.out.printf("%d. %s", i+1, currentDeck.get(i).getPlantName());   
        }
    }

    // tes
}
