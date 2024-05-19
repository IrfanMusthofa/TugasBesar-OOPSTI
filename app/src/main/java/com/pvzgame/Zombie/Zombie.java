package com.pvzgame.Zombie;
import com.pvzgame.Tile;
import com.pvzgame.Plant.Plant;
import com.pvzgame.Map;

public abstract class Zombie {

    // Attributes 
    private String zombieName;
    private int birthTime;

    private int zombieHealth;
    private int zombieAttackDamage;
    private int zombieAttackSpeed;
    private int zombieMoveSpeed;
    public int currentCol;
    public int currentRow;

    private Boolean isAquatic;
    public boolean isHidden;
    public boolean isSlowed;
    public boolean hasTool;

    private Map map;

    // Constructor
    // Will be implemented by subclasses

    // Getters
    public String getZombieName() {
        return zombieName;
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

    public Tile getCurrentTile() {
        return map.getTile(currentRow, currentCol); // Use the instance of Map
    }

    // Setters
    public void setZombieName(String zombieName) {
        this.zombieName = zombieName;
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

    //methods
    public void zombieAction(){
        if (getCurrentTile().getPlant() != null){// tile.getPlant() != null
            // attack
            // getCurrentTile().getPlant().attack();
        } 
        else {
            if (true){ // (currenttime - birthtime) % movespeed >= 1
                moveForward();
            }
        }
    }

    public void attacked(int damage) {
        zombieHealth -= damage;
    }   

    public void changeHiddenStatus() {
        isHidden = !isHidden;
    }

    public void SlowZombie() {
        this.zombieMoveSpeed = zombieMoveSpeed / 2;
        zombieMoveSpeed = zombieMoveSpeed / 2;
    }

    public void UnslowZombie() {
        isSlowed = false;
    }

    public void destroyTool() {
        hasTool = false;
    }

    public void moveForward(){
        int newCol = currentCol - 1;
        if (newCol >= 0) {
            getCurrentTile().removeZombie(this);
            map.getTile(currentRow, newCol).addZombie(this);
            currentCol = newCol;
        }
    }
}
