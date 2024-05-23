package com.pvzgame.Plant;

public class Jalapeno extends Plant {
    // Immediately kills all zombies in the row (land)
    // Immediately sacrifices itself
    
    // Constructor
    public Jalapeno(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(1);
        setPlantName("Jalapeno");
        setIsWaterType(false);
        setSunCost(125);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(-1);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
        setPlantAttackPoints(0);
    }

    //method
    //remove all zombies di row itu
    // public void plantAction(Map map, int row, int cols){ 
    //     Tile[][] tiles = map.getTiles();
    //     for (int i=1;i<11;i++){
    //         tiles[row][i].removeAllZombies();
    //     }
    // }
}
