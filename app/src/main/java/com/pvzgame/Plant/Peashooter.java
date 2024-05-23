package com.pvzgame.Plant;
// import com.pvzgame.Tile;
// import com.pvzgame.Map;

public class Peashooter extends Plant {

    // Constructor
    public Peashooter(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(4);
        setPlantName("Peashooter");
        setIsWaterType(false);
        setSunCost(100);
        setPlantHealth(100);
        setPlantCooldown(5);
        setPlantAttackRange(-1);
        setPlantAttackDamage(25);
        setPlantAttackSpeed(4);
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
