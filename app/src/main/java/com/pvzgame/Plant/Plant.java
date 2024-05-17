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

    public boolean getisWaterType(){
        return isWaterType;
    }
    public void setisWaterType(Boolean currentStatus){
        isWaterType =currentStatus;
    }
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name =name;
    }

    public int getsunCost(){
        return sunCost;
    }

    public void setsunCost(int sunCost){
        this.sunCost =sunCost;
    }
    public int getrange(){
        return range;
    }

    public void setrange(int range){
        this.range = range;
    }
    public int getcooldown(){
        return cooldown;
    }

    public void setcooldown(int cooldown){
        this.cooldown = cooldown;
    }


    public int gethealth(){
        return health;
    }
    public int getattackDamage(){
        return attackDamage;
    }
    public void setattackDamage(int attackDamage){
        this.attackDamage =attackDamage;
    }

    public int getattackSpeed(){
        return attackSpeed;
    }

    public void setattackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
    }
    public int gettimeCreated(){
        return timeCreated;
    }

    public void settimeCreated(int timeCreated){
        this.timeCreated =timeCreated;
    }
    public int getcurrentCol(){
        return currentCol;
    }
    public void setcurrentCol(int currentCol){
        this.currentCol =currentCol;
    }
    

    public void attacked(int damage){
        health -= damage;
        if (health <=0){
            //panggil dead//
        }
    }
    
    
    public void sethealth(int health){
        this.health = health;
    }
}
