package com.pvzgame.Zombie;

import com.pvzgame.PlayableCharacter;

public abstract class Zombie extends PlayableCharacter{
    public int zombieType;
    public String zombieName;
    public int moveSpeed;
    public boolean isSlowed;
    public boolean isHidden;
    public boolean waterBased;
    public boolean hasTool;
    
    public Zombie(String name, int health, int attackDamage, int attackSpeed, int timeCreated, int currentCol, int zombieType, String zombieName, int moveSpeed, boolean isSlowed, boolean isHidden, boolean waterBased, boolean hasTool) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.timeCreated = timeCreated;
        this.currentCol = currentCol;
        this.zombieType = zombieType;
        this.zombieName = zombieName;
        this.moveSpeed = moveSpeed;
        this.isSlowed = isSlowed;
        this.isHidden = isHidden;
        this.waterBased = waterBased;
        this.hasTool = hasTool;
    }

    // Getter
    public int getZombieType() {
        return zombieType;
    }

    public String getZombieName() {
        return zombieName;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public boolean isSlowed() {
        return isSlowed;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public boolean isWaterBased() {
        return waterBased;
    }

    public boolean hasTool() {
        return hasTool;
    }

    // Setter
    public void attacked(int damage) {
        health -= damage;
    }   

    public void changeHiddenStatus() {
        isHidden = !isHidden;
    }

    public void SlowZombie() {
        this.moveSpeed = moveSpeed / 2;
        isSlowed = true;
    }

    public void UnslowZombie() {
        isSlowed = false;
    }

    public void destroyTool() {
        hasTool = false;
    }

    public void moveForward(){}

    public void attack(){
        if (true) { // if there is a plant in front
            // panggil fungsi attacked dari plant
        }
    }

    public void dead(){}
}
