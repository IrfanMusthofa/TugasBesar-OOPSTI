package com.pvzgame;

public abstract class PlayableCharacter {
    protected String name;
    protected int health;
    protected int attackDamage;
    protected int attackSpeed;
    protected int timeCreated;
    protected int currentCol;

    public String getName() {
        return name; 
    }

    public void setHealth(int health) {
        this.health = health; 
    }

    public Integer getHealth() { 
        return health; 
    }

    public Integer getAttackDamage() {
        return attackDamage; 
    }

    public Integer getAttackSpeed() {
        return attackSpeed; 
    }

    public Integer getTimeCreated() {
        return timeCreated; 
    }

    public Integer getCurrentCol() {
        return currentCol; 
    }

    public abstract void dead();
}

