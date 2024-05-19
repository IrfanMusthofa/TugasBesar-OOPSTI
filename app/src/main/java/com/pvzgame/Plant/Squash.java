package com.pvzgame.Plant;

import com.pvzgame.Map;
import com.pvzgame.Tile;

public class Squash extends Plant{
    // Immediately kills the zombie in the same tile or beside it (land)
    // Immediately sacrifices itself

    // Constructor
    public Squash(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(8);
        setPlantName("Squash");
        setIsWaterType(false);
        setSunCost(50);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(1);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }

    public void plantAction(Map map, int row, int cols){ 
        Tile currentTile = map.getTile(row, cols);
        Tile prevTile = map.getTile(row, cols-1);
        Tile nextTile = map.getTile(row, cols+1);
        if (currentTile.getZombies()!= null){ // ada zombie di tilenya squash
            currentTile.removeAllZombies();// menghilangkan semua zombie di current tile
        }
        else if(prevTile.getZombies()!=null){// ada zombie di belakangnya squash
            prevTile.removeAllZombies();
        }
        else if(nextTile.getZombies()!=null){// ada zombie di depan squash
            nextTile.removeAllZombies();
        }
        
    }

}
