package com.pvzgame.Plant;

public class Repeater extends Plant {
    
    // Constructor
    public Repeater(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(6);
        setPlantName("Repeater");
        setIsWaterType(false);
        setSunCost(200);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(-1);
        setPlantAttackDamage(50);
        setPlantAttackSpeed(4);
        setPlantAttackPoints(4);
    } 

    // public void plantAction(Map map, int row, int cols){ 
        
    //     if(inRange(map, row, cols)){
    //         Tile zombiePosition = zombiePosition(map, row, cols);
    //         List<Zombie> zombiesList =  zombiePosition.getZombies();
    //         zombiesList[0].zombieAttacked(getPlantAttackDamage());
    //     }
    // }

    // public boolean inRange(Map map, int row, int cols){
    //     Boolean inRange = false;
    //     for (int i = cols;i<10;i++){
    //         if(map.getTile(row,i).getZombies()!=null){
    //             inRange = true;
    //         }
    //     }
    //     return inRange;
    // }

    // public Tile zombiePosition(Map map, int row, int cols){
    //     Tile zombiePosition = null;
    //     int i = cols;
    //     while(map.getTile(row,i).getZombies()== null && i<10){ // i +1 trus sampe ketemu zombie
    //         i++;
    //     }
    //     return zombiePosition;
    // }
}
