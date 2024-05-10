package com.pvzgame;

public abstract class Zombie extends PlayableCharacter{
    private int zombieType;
    private String zombieName;
    private int moveSpeed;
    private boolean isSlowed;
    private boolean isHidden;
    private boolean waterBased;
    private boolean hasTool;
    private int currentTime;
    
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

    public void attacked(int damage) {
        health -= damage;
    }   

    public void changeHiddenStatus() {
        isHidden = !isHidden;
    }

    public void changeSlowedStatus() {
        isSlowed = true;
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
}
