package com.pvzgame.Zombie;

public class SnorkleZombie extends Zombie{
    
    public SnorkleZombie(String name, int health, int attackDamage, int attackSpeed, int timeCreated, int currentCol, int zombieType, String zombieName, int moveSpeed, boolean isSlowed, boolean isHidden, boolean waterBased, boolean hasTool) {
        super(name, health, attackDamage, attackSpeed, timeCreated, currentCol, zombieType, zombieName, moveSpeed, isSlowed, isHidden, waterBased, hasTool);
    }

    public void submerge(){
        // if di tile air + gak ada tumbuhan
        this.isHidden = true;
    }

    public void emerge(){
        // if di ada tumbuhan
        this.isHidden = false;
    }
}
