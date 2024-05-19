package com.pvzgame.Plant;
import com.pvzgame.Tile;
import com.pvzgame.Map;
public class Kelp extends Plant {
    // Immediately kills the zombie in the same tile (water)
    // Wait first until it kills, then sacrifices itself

    // Constructor
    public Kelp(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(2);
        setPlantName("Kelp");
        setIsWaterType(true);
        setSunCost(50);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(0);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }

    //action
    // setelah dipanggil remove zombie
    public void plantAction(Map map, int row, int cols){ 
        Tile currentTile = map.getTile(row, cols);
        if (currentTile.getZombies()!= null){ // ada zombie
            List<Zombie> list =currentTiles[row][cols].getZombies(); //dapetin list zombie
            currentTile.removeZombie(list[0]);// mengambil zombie yang pertama kali masuk ke tile
        }
        
    }
    
}
