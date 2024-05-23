package com.pvzgame.Plant;
import com.pvzgame.Tile;
import com.pvzgame.Map;
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
        setSunCost(25);
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

    // //action
    // public void plantAttack(Map map){
    //     Tile currentTile = map.getTile();
    //     currentTile.removeAllZombies();

    // }

    // public void plantAction(Map map, int row, int cols){ 
    //     Tile currentTile = map.getTile(row, cols);
    //     if (currentTile.getZombies()!= null){ // ada zombie
            
    //         currentTile.removeAllZombies();// menghilangkan semua zombie di current tile
    //     }
        
    // }
}
