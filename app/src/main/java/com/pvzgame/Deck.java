package com.pvzgame;

public class Deck {
    private List<Plant> kumpulanPlant;
    private Integer availableSlot;

    public Deck(Inventory currentInventory){
        this.kumpulanPlant = currentInventory.getPlants();
        // Integer availableSlot = new Integer(10);
    }



}