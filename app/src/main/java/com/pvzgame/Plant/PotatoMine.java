package com.pvzgame.Plant;

public class PotatoMine extends Plant {
    // Immediately kills all zombies in the same tile (land)
    // Wait 10 seconds before it ready to kill
    // Immediately sacrifices itself after kills
    
    // Attributes
    private Boolean isReadyToKill = false;
    private final int readyToKillTime = 10;

    // Constructor
    public PotatoMine(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(5);
        setPlantName("PotatoMine");
        setIsWaterType(false);
        setSunCost(50);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(0);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }

    // Getter
    public Boolean getIsReadyToKill() {
        return isReadyToKill;
    }

    public int getReadyToKillTime() {
        return readyToKillTime;
    }

    // Setter
    public void setIsReadyToKill(Boolean isReadyToKill) {
        this.isReadyToKill = isReadyToKill;
    }
}
