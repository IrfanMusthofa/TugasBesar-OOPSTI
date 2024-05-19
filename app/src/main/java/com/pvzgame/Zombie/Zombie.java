package com.pvzgame.Zombie;

public abstract class Zombie {

    // Attributes 
    private String zombieName;
    private int birthTime;

    private Boolean isAquatic;

    private int zombieHealth;
    private int zombieAttackDamage;
    private int zombieAttackSpeed;
    private int zombieMoveSpeed;

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
}
