package com.pvzgame.Zombie;

public abstract class Zombie {

    // Attributes 
    private String zombieName;
    private int zombieType;
    private int birthTime;

    private Boolean isAquatic;

    private int zombieHealth;
    private int zombieAttackDamage;
    private int zombieAttackSpeed;
    private int zombieMoveSpeed;
    
    private int currentCol;
    private int currentRow;

    private Boolean isHidden;
    private Boolean isSlowed;
    private Boolean hasTool;
    
    // Constructor
    // Will be implemented by subclasses

    // Getters
    public String getZombieName() {
        return zombieName;
    }

    public int getZombieType() {
        return zombieType;
    }

    public int getBirthTime() {
        return birthTime;
    }

    public Boolean getIsAquatic() {
        return isAquatic;
    }

    public int getZombieHealth() {
        return zombieHealth;
    }

    public int getZombieAttackDamage() {
        return zombieAttackDamage;
    }

    public int getZombieAttackSpeed() {
        return zombieAttackSpeed;
    }

    public int getZombieMoveSpeed() {
        return zombieMoveSpeed;
    }

    public boolean getIsHidden() {
        return isHidden;
    }

    public boolean getIsSlowed() {
        return isSlowed;
    }

    public boolean getHasTool() {
        return hasTool;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    // Setters
    public void setZombieName(String zombieName) {
        this.zombieName = zombieName;
    }

    public void setZombieType(int zombieType) {
        this.zombieType = zombieType;
    }

    public void setBirthTime(int birthTime) {
        this.birthTime = birthTime;
    }

    public void setIsAquatic(Boolean isAquatic) {
        this.isAquatic = isAquatic;
    }

    public void setZombieHealth(int zombieHealth) {
        this.zombieHealth = zombieHealth;
    }

    public void setZombieAttackDamage(int zombieAttackDamage) {
        this.zombieAttackDamage = zombieAttackDamage;
    }

    public void setZombieAttackSpeed(int zombieAttackSpeed) {
        this.zombieAttackSpeed = zombieAttackSpeed;
    }

    public void setZombieMoveSpeed(int zombieMoveSpeed) {
        this.zombieMoveSpeed = zombieMoveSpeed;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public void setIsSlowed(boolean isSlowed) {
        this.isSlowed = isSlowed;
    }

    public void setHasTool(boolean hasTool) {
        this.hasTool = hasTool;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    //methods
    // public void zombieAction(){
    //     if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
    //         setHasTool(false);
    //     }
    //     if (getCurrentTile().getPlant() != null){// tile.getPlant() != null
    //         // attack
    //         // getCurrentTile().getPlant().attack();
    //     } 
    //     else {
    //         int n++;
    //         if ((lifeTime - birthTime) % moveSpeed == 0){ // (currenttime - birthtime) % movespeed >= 1
    //             moveForward();
    //         }
    //     }
    // }

    public void zombieAttack(int damage) {
        zombieHealth -= damage;
    }   


    public void slowZombie() {
        this.zombieMoveSpeed = zombieMoveSpeed * 2;
    }

    public void unslowZombie() {
        isSlowed = false;
        this.zombieMoveSpeed = zombieMoveSpeed / 2;
    }

    // public void moveForward(){
    //     int newCol = currentCol - 1;
    //     if (newCol >= 0) {
    //         getCurrentTile().removeZombie(this);
    //         map.getTile(currentRow, newCol).addZombie(this);
    //         currentCol = newCol;
    //     }
    // }
}
