package com.pvzgame.Plant;

abstract public class Plant {
    private boolean isWaterType;
    private String name;
    private int sunCost;
    private int range;
    private int cooldown;
    
    private int health;
    private int attackDamage;
    private int attackSpeed;
    private int timeCreated;
    private int currentCol;

    abstract void createPlant(int curentCol, int timeCreated);

    public boolean getIsWaterType(){
        return isWaterType;
    }
    public void setIsWaterType(Boolean currentStatus){
        isWaterType =currentStatus;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public int getSunCost(){
        return sunCost;
    }

    public void setSunCost(int sunCost){
        this.sunCost =sunCost;
    }
    public int getRange(){
        return range;
    }

    public void setRange(int range){
        this.range = range;
    }
    public int getCooldown(){
        return cooldown;
    }

    public void setCooldown(int cooldown){
        this.cooldown = cooldown;
    }


    public int getHealth(){
        return health;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public void setAttackDamage(int attackDamage){
        this.attackDamage =attackDamage;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
    }
    public int getTimeCreated(){
        return timeCreated;
    }

    public void setTimeCreated(int timeCreated){
        this.timeCreated =timeCreated;
    }
    public int getCurrentCol(){
        return currentCol;
    }
    public void setCurrentCol(int currentCol){
        this.currentCol =currentCol;
    }
    

    public void attacked(int damage){
        health -= damage;
        if (health <=0){
            //panggil dead tile remove//
        }
    }
    
    
    public void setHealth(int health){
        this.health = health;
    }
}
