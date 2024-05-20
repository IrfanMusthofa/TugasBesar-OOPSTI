package com.pvzgame.Zombie;
import com.pvzgame.*;

public abstract class Zombie {

    // Attributes 
    private String zombieName;
    private int zombieType;
    private int birthTime;

    private Boolean isAquatic;

    private int zombieHealth;
    private int zombieAttackDamage;
    private int zombieAttackSpeed;
    private int zombieMoveSpeed; // berapa point yang ditambahkan setiap detik
    private int currentmovepoints; // berapa point yang sudah ditambahkan
    private int movePoint = 20; // berapa point yang dibutuhkan untuk bergerak
    
    private int col;

    private Boolean isHidden;
    private Boolean isSlowed;
    private Boolean hasTool;

    private static int zombieCount = 0;
    
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

    public int getCurrentMovePoints() {
        return currentmovepoints;
    }

    public int getMovePoint() {
        return movePoint;
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
        return col;
    }

    public static int getZombieCount() {
        return zombieCount;
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

    public void setCurrentCol(int col) {
        this.col = col;
    }

    public static void incZombieCount() {
        zombieCount++;
    }

    // methods
    // public void zombieAction(Map map, int row, int col){
    //     if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
    //         setHasTool(false);
    //     }
    //     if (map.getTile(row, col).getPlant() != null){ // mengecek ada tanaman atau tidak
    //         map.getTile(row, col).getPlant().plantAttacked(getZombieAttackDamage()*getZombieAttackSpeed());
    //     } else {
    //         addCurrentMovePoints(getZombieMoveSpeed()); // movemodifier defaultnya 2 jadinya movetime setiap detik nambah 2
    //         if (getCurrentMovePoints() <= getMovePoint()){ // apakah sudah waktunya bergerak
    //             moveForward(map, row, col);
    //             resetCurrentMovePoints();
    //         }
    //     }
    // }

    public void zombieAttacked(int damage) {
        zombieHealth -= damage;
    }   

    public void slowZombie() {
        isSlowed = true;
        this.zombieMoveSpeed /= 2;
        this.zombieAttackDamage /= 2;
    }

    public void unslowZombie() {
        isSlowed = false;
        this.zombieMoveSpeed *= 2;
        this.zombieAttackDamage *= 2;
    }

    // public void moveForward(Map map, int row, int col){
    //     int newCol = col - 1;
    //     if (newCol >= 0) {
    //         map.getTile(row, col).removeZombie(this);
    //         map.getTile(row, newCol).addZombie(this);
    //         this.col = newCol;
    //     }
    // }

    public void addCurrentMovePoints(int points) {
       this.currentmovepoints += points;
    }

    public void resetCurrentMovePoints() {
        this.currentmovepoints = 0;
    }
}