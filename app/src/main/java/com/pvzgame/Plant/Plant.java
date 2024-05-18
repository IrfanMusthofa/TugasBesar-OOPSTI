package com.pvzgame.Plant;

public abstract class Plant {
    
    // Attributes
    private String plantName;
    private int birthTime;

    private Boolean isWaterType;

    private int sunCost;
    private int plantHealth;
    private int plantCooldown;
    private int plantAttackRange;
    private int plantAttackDamage;
    private int plantAttackSpeed;

    private int currentCol;
    private int currentRow;

    // Constructor
    // Will be implemented by subclasses

    // Getters
    public String getPlantName() {
        return plantName;
    }

    public int getBirthTime() {
        return birthTime;
    }

    public Boolean getIsWaterType() {
        return isWaterType;
    }

    public int getSunCost() {
        return sunCost;
    }

    public int getPlantHealth() {
        return plantHealth;
    }

    public int getPlantCooldown() {
        return plantCooldown;
    }

    public int getPlantAttackRange() {
        return plantAttackRange;
    }

    public int getPlantAttackDamage() {
        return plantAttackDamage;
    }

    public int getPlantAttackSpeed() {
        return plantAttackSpeed;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    // Setters
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public void setBirthTime(int birthTime) {
        this.birthTime = birthTime;
    }

    public void setIsWaterType(Boolean isWaterType) {
        this.isWaterType = isWaterType;
    }

    public void setSunCost(int sunCost) {
        this.sunCost = sunCost;
    }

    public void setPlantHealth(int plantHealth) {
        this.plantHealth = plantHealth;
    }

    public void setPlantCooldown(int plantCooldown) {
        this.plantCooldown = plantCooldown;
    }

    public void setPlantAttackRange(int plantAttackRange) {
        this.plantAttackRange = plantAttackRange;
    }

    public void setPlantAttackDamage(int plantAttackDamage) {
        this.plantAttackDamage = plantAttackDamage;
    }

    public void setPlantAttackSpeed(int plantAttackSpeed) {
        this.plantAttackSpeed = plantAttackSpeed;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }
}
